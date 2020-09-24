<!-- home -->
<template>
  <div class="register-container">
    <van-row class="register-main">
      <van-form @submit="onSubmit">
        <van-col :span="24" style="margin-top:15px;">
          <van-field
            style="margin:0px 10px;"
            v-model="phone"
            name="phone"
            type="tel"
            label=""
            placeholder=""
            :rules="[{ required: true, message: '请填写手机号' }]"
          >
            <template #left-icon>
              <van-icon name="phone-o"></van-icon>
            </template>
          </van-field>
        </van-col>
        <van-col :span="24" style="margin:15px 0px;">
          <van-field
            v-model="verifyCode"
            type="digit"
            label=""
            placeholder="请输入收到的验证码"
            :rules="[{ required: true, message: '请输入收到的验证码' }]"
          >
          <template #left-icon>
              <van-icon name="chat-o"></van-icon>
            </template>
          
          </van-field>
        </van-col>
      
        <div style="margin: 16px;">
          <van-button round block type="info" native-type="submit">
            立即注册
          </van-button>
        </div>
    </van-form>
    </van-row>
  </div>
</template>

<script>
// 请求接口
// import { getUserInfo } from '@/api/user.js'
import Vue from 'vue'
import { Button, Field, Form, Row,Icon, Notify} from 'vant'

Vue.use(Form)
Vue.use(Button)
Vue.use(Field)
Vue.use(Row)
Vue.use(Icon)
Vue.use(Notify)





export default {
  data() {
    return {
      phone:'',
      verifyCode:''
    }
  },
  computed: {
  },
  mounted() {
   // this.initData()
  },
  methods: {
    onSubmit(){
      Notify({type:'warning',message:'提交注册'})
    },
    // 请求数据案例
    initData() {
    
    },
    // Action 通过 store.dispatch 方法触发
    doDispatch() {
      
    },
    goGithub() {
     
    }
  }
}
</script>
<style lang="scss">
.register-container {
  .register-main{
    margin: 240px 10px 0px;
    border: 1px solid #ccc;
    border-radius: 5px;
  }
}
</style>
