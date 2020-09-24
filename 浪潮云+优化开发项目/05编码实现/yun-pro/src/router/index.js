// 导入组件
import Vue from 'vue';
import Router from 'vue-router';

// 首页
import index from '@/views/index';



// 启用路由
Vue.use(Router);

// 导出路由 
export default new Router({
    routes: [{
        path: '/',
        name: '',
        component: index,
        hidden: true,
        meta: {
            requireAuth: false
        }
    }, {
        path: '/index',
        name: '首页',
        component: index,
        hidden: true,
        meta: {
            requireAuth: false
        }
    }]
})