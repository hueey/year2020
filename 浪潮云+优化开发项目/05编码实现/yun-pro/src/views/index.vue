<template>
  <div class="main">
    <el-row>
      <el-col :span="24" class="manager-header">
        <el-col :span="8">
          <span style="margin-right: 10px;">配置页面</span>
          <el-select v-model="selectedPage" size="mini" v-if="configMore">
            <el-option v-for="item in selectList" :key="item.value"  :value="item.value"  :label="item.label" />
          </el-select>
        </el-col>
        <el-col :span="16" style="text-align:right;padding-right: 10px;">
          <el-button type="primary" size="mini" v-if="configMore">预览</el-button>
          <el-button type="primary" size="mini" @click="save" >发布</el-button>
        </el-col>
      </el-col>
    </el-row>
    <el-row>
      <el-col :span="11" class="config-item-1">

        <el-col :span="24" class="config-item-header">
          <el-col :span="8"  class="config-item-label">
            头部配置
          </el-col>
          <el-col :span="16" class="config-item-tools">
              <el-switch v-model="data.lcHeaderConfVo.status" active-text="显示" :active-value="1" :inactive-value="0" inactive-text="隐藏" ></el-switch>
          </el-col>
        </el-col>

        <el-col :span="24" class="config-item-main">
          <el-form :model="data.lcHeaderConfVo" :inline="true" >
            <el-form-item prop="logo" class="config-item-header-logo">
              <div class="formIMgContent">
                <img
                  :src="`${data.lcHeaderConfVo.logoFileUrl}`"
                  class="dImage"
                  v-if="data.lcHeaderConfVo.logoFileUrl"
                />
                <input
                  id="fileId1"
                  type="file"
                  name="file"
                  class="inputFile"
                  @change="ImgUpLoad"
                />
                <div class="dtext">编辑logo</div>
              </div>

            </el-form-item>
            <el-form-item
              class="header-item-value" 
              prop="headerName"
              label="企业名称"
              size="small">
              <el-input v-model="data.lcHeaderConfVo.headerName"></el-input>
            </el-form-item>
            <el-form-item 
              class="header-item-value"
              prop="rgbColor"
              label="背景色"
                size="small">
              <el-color-picker v-model="data.lcHeaderConfVo.rgbColor"/>
            </el-form-item>
            <el-form-item
              class="header-item-value" 
              prop="bgImag"
              label="背景图"
              size="small">
                <div class="upload-bg-img">
                  <el-input clearable v-model="showBgImgName" :disabled="true"></el-input>
                  <el-upload
                      :show-file-list="false"
                      :limit="1"
                      ref="bgUpload"
                      :action="URLS.upload"
                      :before-upload="beforeBgUpload"
                      :on-success="uploadBgSuccess"
                  >
                    <el-button type="success" @click.stop="resetBgImg()"  title="" plain size="small">重置</el-button>
                    <el-button type="primary" @click.stop="uploadBgImg()" title="" size="small">上传</el-button>
                  </el-upload>
                </div>
            </el-form-item>
          </el-form>
        </el-col>
      </el-col>

      <el-col :span="11" class="config-item-2">

        <el-col :span="24" class="config-item-header">
          <el-col :span="8"  class="config-item-label">
            广告轮播
          </el-col>
          <el-col :span="16" class="config-item-tools">
              <el-switch v-model="homeBannerShow" active-text="显示" :active-value="1" :inactive-value="0" inactive-text="隐藏" ></el-switch>
          </el-col>
        </el-col>
        <el-col :span="24" style="text-align:left; padding-left:10px">
          <div class="banner-list">
            <ul class="banner-list-ul">
              <li class="banner-list-li" v-for="(item,i) in data.lcHomeBannerConfVos" :key="i">
                <div class="warpper">`
                  <img :src="`/api${item.adImgUrl}`" alt="" />
                  <el-row class="banner-list-li-tools">
                      <el-col :span="4"  style="font-size:20px;">{{i}}</el-col>
                      <el-col  :span="20" style="text-align:right;font-size:20px;">
                          <span
                            style="padding-left:100px;"
                            class="el-upload-list__item-edit"
                            @click="editBanner(item, i, 'home')"
                          >
                            <i class="el-icon-edit-outline"></i>
                          </span>
                          <span
                            class=""
                            @click="removeBanner(item, i, 'home')"
                          >
                            <i class="el-icon-delete"></i>
                          </span>
                      </el-col>
                  </el-row>
                </div>
              </li>
              <li class="banner-list-li" v-if="data.lcHomeBannerConfVos.length < 5">
                <div class="warpper" @click="addBanner('home')" style="line-height:168px;">
                  <i class="el-icon-plus"></i>
                </div>
              </li>
            </ul>
          </div>
        </el-col>
      </el-col>

    </el-row>
    <el-row>
      <el-col :span="11" class="config-item-1" style="height:244px">

        <el-col :span="24" class="config-item-header">
          <el-col :span="4"  class="config-item-label">
            应用列表
          </el-col>
          <el-col :span="12">
            <div style="overflow:auto;">
              <el-tag v-for="(item, index) in infoAppList" :key="index">
                <img :src="item.imgUrl">
              </el-tag>
              <span> 可拖拽进行排序</span>
            </div>
          </el-col>
          <el-col :span="8" class="config-item-tools">
            <el-button @click="addApp" size="mini" type="primary" style="margin-right:15px;" v-if="configMore">新增</el-button>
            <el-switch v-model="appShow" active-text="显示" :active-value="1" :inactive-value="0" inactive-text="隐藏" ></el-switch>
          </el-col>
        </el-col>
        <el-col :span="24" class="config-item-main">
            <div class="config-app-item">
            <div class="config-app-item-img">
              <img :src="data.lcHeaderConfVo.logo">
            </div>
            <div class="config-app-item-label">电子邮箱</div>
            <div class="config-app-item-tools">
              <el-checkbox v-model="selectApp"></el-checkbox>
            </div>
          </div>

          <div class="config-app-item">
            <div class="config-app-item-img">
              <img :src="data.lcHeaderConfVo.logo">
            </div>
            <div class="config-app-item-label">电子邮箱</div>
            <div class="config-app-item-tools">
              <el-checkbox v-model="selectApp"></el-checkbox>
            </div>
          </div>
        </el-col>
      </el-col>

      <el-col :span="11" class="config-item-2">

        <el-col :span="24" class="config-item-header">
          <el-col :span="8"  class="config-item-label">
            资讯轮播
          </el-col>
          <el-col :span="16" class="config-item-tools">
              <el-switch v-model="infoBannerShow" active-text="显示" :active-value="1" :inactive-value="0" inactive-text="隐藏" ></el-switch>
          </el-col>
        </el-col>
        <el-col :span="24" style="text-align:left; padding-left:10px">
          <div class="banner-list">
            <ul class="banner-list-ul">
              <li class="banner-list-li" v-for="(item, i) in data.lcInfoBannerConfVos" :key="i">
                <div class="warpper">
                  <img :src="`/api${item.adImgUrl}`" alt="" />
                  <el-row class="banner-list-li-tools">
                      <el-col :span="4" style="font-size:20px;">{{i}}</el-col>
                      <el-col  :span="20" style="text-align:right;font-size:20px;">
                          <span
                            style="padding-left:100px;"
                            class="el-upload-list__item-edit"
                            @click="editBanner(item, i, 'info')"
                          >
                            <i class="el-icon-edit-outline"></i>
                          </span>
                          <span
                            @click="removeBanner(item, i, 'info')"
                          >
                            <i class="el-icon-delete"></i>
                          </span>
                      </el-col>
                  </el-row>
                </div>
              </li>
              <li class="banner-list-li" v-if="data.lcInfoBannerConfVos.length < 5">
                <div class="warpper" @click="addBanner('info')" style="line-height:168px;">
                  <i class="el-icon-plus"></i>
                </div>
              </li>
            </ul>
          </div>
        </el-col>
      </el-col>
    </el-row>

    <el-dialog
      :close-on-click-modal="false"
      :close-on-press-escape="false"
      :visible.sync="dialogVisible"
      width="30%"
      :before-close="handleClose">
        <el-form>
          <el-form-item 
          prop="title"
          label="标题"
          size="mini">
          <el-input v-model="editInfo.name"></el-input>
        </el-form-item>
         <el-form-item 
          prop="adImgLinkUrl"
          label="跳转地址"
          size="mini">
          <el-input v-model="editInfo.adImgLinkUrl"></el-input>
        </el-form-item>
        <el-form-item 
          prop="img"
          label="图片"
          size="mini">
          <el-upload
            class="avatar-uploader"
            :action="URLS.upload"
            :data="uploadData"
            :show-file-list="false"
            :on-success="handleAvatarSuccess">
              <img v-if="imageUrl" :src="imageUrl" class="avatar" />
              <i v-else class="el-icon-plus avatar-uploader-icon"></i>
          </el-upload>
        </el-form-item>
        <el-form-item>
          <el-button @click="handleClose">取消</el-button>
          <el-button type="primary" @click="onSubmit">新增</el-button>
        </el-form-item>
        </el-form>
    </el-dialog>
  </div>
</template>

<script>
import { 
  Row,
  Col,
  Button,
  Select,
  Switch,
  Upload,
  Avatar,
  Form,
  Input,
  ColorPicker,
  FormItem,
  Option,
  Dialog,
  Tag,
  Radio,
  Checkbox
  } from 'element-ui'

import Vue from 'vue'
import { get, save, upload } from '@/api/index'

Vue.use(ColorPicker)
Vue.use(Row)
Vue.use(Col)
Vue.use(Select)
Vue.use(Button)
Vue.use(Switch)
Vue.use(Upload) 
Vue.use(Avatar) 
Vue.use(Form) 
Vue.use(FormItem)
Vue.use(Input)
Vue.use(Option)
Vue.use(Dialog)
Vue.use(Tag)
Vue.use(Radio)
Vue.use(Checkbox)




const URLS = {
  upload: "/api/File/uploadFile"
}
const bannerItem = {
    adImgLinkType: '',
    adImgLinkUrl: '',
    adImgUrl: '',
    remark: '',
    status: 1,
    title: ''
}
export default {
  name: 'Manager',
  components:{},
  data() {
    return {
      showBgImgName: '',
      appShow: 1,
      bgFileList: [],
      uploadData: {
        type: 'post'
      },
      homeBannerShow: 1,
      infoBannerShow: 1,

      configMore: false,

      selectedPage: '1',


      selectApp: "1",
      infoAppList: [],
      
      bgFileList: [],

      dialogVisible: false,

      imageUrl: '',

      editInfo: {
        adImgLinkType: '',
        adImgLinkUrl: '',
        adImgUrl: '',
        remark: '',
        status: 1,
        title: ''
      },

      selectList: [
        {
          value: '1',
          label: '首页'
        },
        {
          value: '2',
          label: '其他'
        }
      ],
      data: {
        lcHeaderConfVo: {
          bgFileUrl: '',
          headerName: '',
          logoFileUrl: '',
          rgbColor: '',
          status: 1
        },
        lcHomeBannerConfVos: [],
        lcInfoBannerConfVos: [],
        lcAppModuleConfVos: []
      }
    }
  },
  computed: {
    // showBgImgName() {
    //   return this.data.lcHeaderConfVo.bgFileUrl.split('/').pop()
    // }
  },
  created (){
    this.URLS = URLS
    this.getData()
  },
  mounted() {

  },
  methods: {
    beforeBgUpload(e) {
        console.log(e)
    },

    uploadBgSuccess(res) {
      if (res.code === 1) {
        this.data.lcHeaderConfVo.bgFileUrl = res.data.relativePath
        this.showBgImgName = res.data.relativePath.split('/').pop()
      }
    },
    resetBgImg(){

    },
    uploadBgImg() {
      const ref = this.$refs.bgUpload
        const file = ref.$el && ref.$el.querySelectorAll('.el-upload__input')[0] 
        ref && ref.clearFiles()
        file && file.click()
    },

    ImgUpLoad(e) {
      let _this = this
      let formData = new FormData();
      formData.append('file', e.target.files[0]);
      // formData.append('bus_type', 'report_user_signature');
      upload(formData).then((res) => {
        if (res.code === 1) {
          _this.data.lcHeaderConfVo.logoFileUrl = res.data.relativePath
        }
      });
    },
    getData() {
       get().then(res=>{

      }).catch(res=>{

      })
    },
    save(){
      const data = {
        data: JSON.stringify(this.data)
      }
      save(JSON.stringify(this.data)).then(res=>{
      }).catch(res=>{

      })
    },
    onSubmit(){
      let data = JSON.parse(JSON.stringify(this.editInfo))
      if (this.editKey === 'home') {
        if (this.editIndex ===  undefined) {
          this.data.lcHomeBannerConfVos.push(data)
        } else {
          this.data.lcHomeBannerConfVos.splice(this.editIndex, 1, data)
        }
      } else {
        if (this.editIndex ===  undefined) {
          this.data.lcInfoBannerConfVos.push(data)
        } else {
          this.data.lcInfoBannerConfVos.splice(this.editIndex, 1, data)
        }
      }
      delete this.editIndex
      this.editInfo = bannerItem
      this.dialogVisible = false
    },
    //新增应用
    addApp(){

    },
    BannerChange() {

    },
    removeBanner(info, index, key) {
      if (key === 'home') {
        this.data.lcHomeBannerConfVos.splice(index, 1)
      } else {
        this.data.lcInfoBannerConfVos.splice(index, 1)
      }
    },
    addBanner(key) {
      delete this.editIndex
      this.editKey = key
      this.dialogVisible = true
    },
    editBanner(info,i, key) {
      this.editIndex = i
      this.editKey = key
      this.editInfo = info
      this.dialogVisible = true
    },
    handleAvatarSuccess(e) {
      if (e.code === 1) { 
        this.editInfo.adImgUrl = e.data.relativePath
        this.imageUrl = '/api'+e.data.relativePath
      }
      
    },
    logoChange(){

    },
    handlePreview() {

    },
    handleRemove() {

    },
    handleClose() {
      delete this.editIndex
      this.editInfo = bannerItem
      this.dialogVisible = false
    }
  }
}

</script>

<style scoped>
.formIMgContent {
    width: 150px;
    height: 150px;
    margin: 0 auto;
    position: relative;
    border-radius: 50%;
    overflow: hidden;
  }
  .dtext {
      position: absolute;
      bottom: 0;
      text-align: center;
      height: 20px;
      line-height: 20px;
      background: rgba(0, 0, 0, 0.5);
      color: #ffffff;
      width: 100%;
      font-size: 14px;
    }
  .inputFile {
      position: absolute;
      display: block;
      width: 150px;
      height: 150px;
      top: 0px;
      left: 0px;
      opacity: 0;
      z-index: 200;
    }
  .dImage {
      display: inline-block;
      width: 130px;
      height: 130px;
      border-radius: 50%;
    }
</style>
