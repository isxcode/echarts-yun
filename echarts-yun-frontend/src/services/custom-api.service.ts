import { http } from '@/utils/http'

// 自定义接口分页查询
export function QueryCustomApiList(params: any): Promise<any> {
    return http.request({
        method: 'post',
        url: '/vip/api-module/pageApi',
        params: params
    })
}

// 创建api
export function CreateCustomApiData(params: any): Promise<any> {
    return http.request({
        method: 'post',
        url: '/vip/api-module/addApi',
        params: params
    })
}
// 更新api
export function UpdateCustomApiData(params: any): Promise<any> {
    return http.request({
        method: 'post',
        url: '/vip/api-module/updateApi',
        params: params
    })
}
// 删除api
export function DeleteCustomApiData(params: any): Promise<any> {
    return http.request({
        method: 'post',
        url: '/vip/api-module/deleteApi',
        params: params
    })
}
// 发布api
export function PublishCustomApiData(params: any): Promise<any> {
    return http.request({
        method: 'post',
        url: '/vip/api-module/publishApi',
        params: params
    })
}
// 下线api
export function OfflineCustomApiData(params: any): Promise<any> {
    return http.request({
        method: 'post',
        url: '/vip/api-module/offlineApi',
        params: params
    })
}

// 获取详情
export function GetCustomApiDetailData(params: any): Promise<any> {
    return http.request({
        method: 'post',
        url: '/vip/api-module/getApi',
        params: params
    })
}

// 测试api
export function TestCustomApiData(params: any): Promise<any> {
    return http.request({
        method: 'post',
        url: '/vip/api-module/testApi',
        params: params
    })
}
