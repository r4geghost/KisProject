import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios";

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        msg: "Diusov Mihail YVA-411",
        vagonList: [{
            "nomvag": "60284189",
            "vrsvop": "2022-03-04T15:26:00.000+00:00",
            "idPoezd": 1495,
            "disEsr": "800008",
            "disPark": "06",
            "disPut": "09",
            "kodop": "03",
            "tipOp": "00",
            "savedate": "2022-03-04T15:26:39.594+00:00",
            "kodKateg": null,
            "esrNazn": null,
            "vesGruz": null,
            "pnv": 44
        }, {
            "nomvag": "29065802",
            "vrsvop": "2022-03-04T16:54:00.000+00:00",
            "idPoezd": 1513,
            "disEsr": "800008",
            "disPark": "01",
            "disPut": "08",
            "kodop": "01",
            "tipOp": "00",
            "savedate": "2022-03-04T16:54:44.806+00:00",
            "kodKateg": null,
            "esrNazn": null,
            "vesGruz": null,
            "pnv": 1
        }, {
            "nomvag": "55851653",
            "vrsvop": "2022-03-04T18:45:00.000+00:00",
            "idPoezd": 1536,
            "disEsr": "800008",
            "disPark": "06",
            "disPut": "12",
            "kodop": "03",
            "tipOp": "00",
            "savedate": "2022-03-04T18:45:42.179+00:00",
            "kodKateg": null,
            "esrNazn": null,
            "vesGruz": null,
            "pnv": 43
        }, {
            "nomvag": "60303682",
            "vrsvop": "2022-03-04T18:45:00.000+00:00",
            "idPoezd": 1536,
            "disEsr": "800008",
            "disPark": "06",
            "disPut": "12",
            "kodop": "03",
            "tipOp": "00",
            "savedate": "2022-03-04T18:45:42.182+00:00",
            "kodKateg": null,
            "esrNazn": null,
            "vesGruz": null,
            "pnv": 44
        }, {
            "nomvag": "63258354",
            "vrsvop": "2022-03-04T18:45:00.000+00:00",
            "idPoezd": 1536,
            "disEsr": "800008",
            "disPark": "06",
            "disPut": "12",
            "kodop": "03",
            "tipOp": "00",
            "savedate": "2022-03-04T18:45:42.185+00:00",
            "kodKateg": null,
            "esrNazn": null,
            "vesGruz": null,
            "pnv": 45
        }, {
            "nomvag": "61545711",
            "vrsvop": "2022-03-04T18:45:00.000+00:00",
            "idPoezd": 1536,
            "disEsr": "800008",
            "disPark": "06",
            "disPut": "12",
            "kodop": "03",
            "tipOp": "00",
            "savedate": "2022-03-04T18:45:42.187+00:00",
            "kodKateg": null,
            "esrNazn": null,
            "vesGruz": null,
            "pnv": 46
        }, {
            "nomvag": "53097879",
            "vrsvop": "2022-03-04T18:45:00.000+00:00",
            "idPoezd": 1536,
            "disEsr": "800008",
            "disPark": "06",
            "disPut": "12",
            "kodop": "03",
            "tipOp": "00",
            "savedate": "2022-03-04T18:45:42.190+00:00",
            "kodKateg": null,
            "esrNazn": null,
            "vesGruz": null,
            "pnv": 47
        }, {
            "nomvag": "52775707",
            "vrsvop": "2022-03-04T18:45:00.000+00:00",
            "idPoezd": 1536,
            "disEsr": "800008",
            "disPark": "06",
            "disPut": "12",
            "kodop": "03",
            "tipOp": "00",
            "savedate": "2022-03-04T18:45:42.193+00:00",
            "kodKateg": null,
            "esrNazn": null,
            "vesGruz": null,
            "pnv": 48
        }, {
            "nomvag": "37851508",
            "vrsvop": "2022-03-04T16:08:01.000+00:00",
            "idPoezd": 1491,
            "disEsr": "800008",
            "disPark": null,
            "disPut": null,
            "kodop": "02",
            "tipOp": "00",
            "savedate": "2022-03-04T16:08:41.732+00:00",
            "kodKateg": null,
            "esrNazn": null,
            "vesGruz": null,
            "pnv": 3
        }, {
            "nomvag": "19602515",
            "vrsvop": "2022-03-04T16:08:01.000+00:00",
            "idPoezd": 1491,
            "disEsr": "800008",
            "disPark": null,
            "disPut": null,
            "kodop": "02",
            "tipOp": "00",
            "savedate": "2022-03-04T16:08:41.736+00:00",
            "kodKateg": null,
            "esrNazn": null,
            "vesGruz": null,
            "pnv": 4
        }]
    },
    getters: {
        getMsg(state) {
            return state.msg
        },
        getVagonList(state) {
            return state.vagonList
        }
    },
    mutations: {
        setVagonList(state, vagonList) {
            state.vagonList = vagonList
        }
    },
    actions: {
        async loadVagonList(context) {
            try {
                const url = '/kis/vagons'
                const response = await axios.get(url)
                const results = response.data
                context.commit("setVagonList", results)
            } catch (err) {
                if (err.response) {
                    console.log("Server error: ", err)
                } else if (err.request) {
                    console.log("Network error: ", err)
                } else {
                    console.log("Client error: ", err)
                }
            }
        }

    },
    modules: {}
})
