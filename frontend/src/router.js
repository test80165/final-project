
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"

import InventoryInventoryManager from "./components/listers/InventoryInventoryCards"
import InventoryInventoryDetail from "./components/listers/InventoryInventoryDetail"

import MembershipPointManager from "./components/listers/MembershipPointCards"
import MembershipPointDetail from "./components/listers/MembershipPointDetail"

import DeliveryDeliveryManager from "./components/listers/DeliveryDeliveryCards"
import DeliveryDeliveryDetail from "./components/listers/DeliveryDeliveryDetail"


import PaymentPayManager from "./components/listers/PaymentPayCards"
import PaymentPayDetail from "./components/listers/PaymentPayDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },

            {
                path: '/inventories/inventories',
                name: 'InventoryInventoryManager',
                component: InventoryInventoryManager
            },
            {
                path: '/inventories/inventories/:id',
                name: 'InventoryInventoryDetail',
                component: InventoryInventoryDetail
            },

            {
                path: '/memberships/points',
                name: 'MembershipPointManager',
                component: MembershipPointManager
            },
            {
                path: '/memberships/points/:id',
                name: 'MembershipPointDetail',
                component: MembershipPointDetail
            },

            {
                path: '/deliveries/deliveries',
                name: 'DeliveryDeliveryManager',
                component: DeliveryDeliveryManager
            },
            {
                path: '/deliveries/deliveries/:id',
                name: 'DeliveryDeliveryDetail',
                component: DeliveryDeliveryDetail
            },


            {
                path: '/payments/pays',
                name: 'PaymentPayManager',
                component: PaymentPayManager
            },
            {
                path: '/payments/pays/:id',
                name: 'PaymentPayDetail',
                component: PaymentPayDetail
            },



    ]
})
