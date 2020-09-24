
import { req } from '@/utils/request';

// 上传 
export const upload = (params) => { return req("post", "/api/File/uploadFile", params) };
export const get = (params) => { return req("get", "/api/SysConfig/getHomeConfig", params) };
export const save = (params) => { return req("post", "/api/SysConfig/saveHomeConfig", params) };
