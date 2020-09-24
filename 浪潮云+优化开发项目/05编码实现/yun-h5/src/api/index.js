
// axios
import request from '@/utils/request'

// 登录
export function get(data) {
  return request({
    url: "/api/SysConfig/getHomeConfig",
    method: 'get',
    data
  })
}

// 用户信息 post 方法
export function getUserInfo(data) {
  return request({
    url: api.UserInfo,
    method: 'post',
    data
  })
}

