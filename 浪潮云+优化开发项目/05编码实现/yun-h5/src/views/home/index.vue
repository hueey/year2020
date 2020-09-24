<!-- home -->
<template>
  <div class="index-container">
    <van-row class="header">
      <van-col :span="8" :style="logoStyle">
        <van-image height="45px" :src="logoUrl"></van-image>
      </van-col>
      <van-col :span="14" :style="logoStyle">
        <div class="header-label">开滦集团</div>
      </van-col>
    </van-row>
    <van-row style="width:100%; height:220px;" class="home-banner">
      <van-swipe class="home-swipe" :autoplay="3000" indicator-color="#1989fa" width="360">
        <van-swipe-item style="width: 360px;" v-for="item in list" :key="item" @click="homeBannerClick">
          <img :src="item"/>
        </van-swipe-item>
      </van-swipe>
    </van-row>
    <van-row style="margin-top:15px;">
      <van-col
          v-for="(item, index) in menuList"
          :key="index"
          :span="6"
          :style="{textAlign: 'center', padding: '8px 0'}"
        >
            <van-icon :name="item.icon" class="menu-item" @click="appClick"/>
            <p>{{ item.name }}</p>
        </van-col>
    </van-row>
    <van-row style="width:100%; height:180px;" class="info-banner">
      <van-swipe class="info-swipe" :autoplay="3000" indicator-color="#1989fa" width="360">
        <van-swipe-item style="width: 360px;" v-for="item in list" :key="item" @click="infoBannerClick">
          <img :src="item"/>
        </van-swipe-item>
      </van-swipe>
    </van-row>
    <van-row style="margin-top:10px">
      <van-col :span="24">
        <van-col :span="5" style="text-align:left;color:#409eff;padding-left:10px; font-size:17px;">
          集团新闻
        </van-col>
        <van-col :span="19" style="text-align:right;color:#409eff;padding-right:10px;">
          <van-button plain type="info" size="mini" @click="more">更多</van-button>
        </van-col>
      </van-col>
      <van-list
      >
        <van-cell v-for="(item,i) in news" :key="i" :title="item.title" @click="newsClick(item)" />
      </van-list>
    </van-row>
  </div>
</template>
  
<script>
import Vue from 'vue'
import { get } from '@/api/index'
import { Col, NavBar, Row, Image as VanImage, Swipe, SwipeItem, Icon, Notify, Button} from 'vant'

Vue.use(NavBar)
Vue.use(Row)

Vue.use(Col)
Vue.use(VanImage)
Vue.use(Swipe)
Vue.use(SwipeItem)
Vue.use(Icon)
Vue.use(Notify)
Vue.use(Button)

export default {
  data() {
    return {
      finished: true,
      logoUrl:'https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100',
      list: [
        'https://img.yzcdn.cn/vant/apple-1.jpg',
        'https://img.yzcdn.cn/vant/apple-2.jpg',
        'https://img.yzcdn.cn/vant/apple-3.jpg',
        'https://img.yzcdn.cn/vant/apple-4.jpg'

      ]
      ,
      menuList:[
        {
          name:'电子邮箱',
          icon:'comment-circle-o'
        },
        {
          name:'电子邮箱',
          icon:'comment-circle-o'
        },
        {
          name:'电子邮箱',
          icon:'comment-circle-o'
        },
        {
          name:'电子邮箱',
          icon:'comment-circle-o'
        },
        {
          name:'电子邮箱',
          icon:'comment-circle-o'
        },
        {
          name:'电子邮箱',
          icon:'comment-circle-o'
        },
        {
          name:'电子邮箱',
          icon:'comment-circle-o'
        },
        {
          name:'更多',
          icon:'comment-circle-o'
        },
      ],
      news:[
        {
          title:"面向大海，春暖花开",
          url:'https://www.baidu.com'
        },
        {
          title:"面向大海，春暖花开",
          url:'https://www.baidu.com'
        },
        {
          title:"面向大海，春暖花开",
          url:'https://www.baidu.com'
        },
        {
          title:"集团抗疫获得圆满成功",
          url:'https://www.baidu.com'
        }
      ]
    }

  },

  computed: {},
  created (){
    this.getInfo()
  },
  mounted() { },

  methods: {
    getInfo(){
      get().then(res=>{
        debugger
      }).catch(res=>{
        debugger
      })
    },
    logoStyle() {
      return ''
    },
    appClick() {
       Notify({type:'success',message:'打开应用'})
    },
    homeBannerClick() {
       Notify({type:'success',message:'点击轮播'})
    },
    infoBannerClick(){
      Notify({type:'success',message:'点击咨询'})
    },
    newsClick(info){
      Notify({type:'success',message:'点击新闻'})
    },
    more(){
      Notify({type:'warning',message:'没有更多了'})
    }
  }
}
</script>
<style lang="scss" scoped>
.index-container {
  .header{
    margin-top: 10px;
    .header-label{
      margin-left:10px;
      font-size:16px;
    }
  }
  .home-banner{
    .home-swipe{
      border-radius: 5px;
      border: 1px solid #c1bdbd;
      margin: 5px;
      img{
        display: block;
        box-sizing: border-box;
        width: 100%;
        height: 200px;
        padding: 30px 60px;
        background-color: #fff;
        pointer-events: none;
      }
    }
  }
  .menu-item{
    color: #409eff;
    font-size: 32px;
  }
  .info-banner{
    .info-swipe{
      border-radius: 5px;
      border: 1px solid #c1bdbd;
      margin: 5px;
      img{
        display: block;
        box-sizing: border-box;
        width: 100%;
        height: 160px;
        padding: 30px 60px;
        background-color: #fff;
        pointer-events: none;
      }
    }
  }
  
}
</style>
