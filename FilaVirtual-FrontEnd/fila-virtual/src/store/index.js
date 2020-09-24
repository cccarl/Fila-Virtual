import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex, axios)

export default new Vuex.Store({
	state: {
		users: []
	},
	mutations: {

		getAllUsers(state) {
			try {
				axios.get('http://localhost:8081/queue/getQueue/1')
					.then(response => {
						//Se guarda la respuesta que envía el backend en la variable users.
						state.users = response.data;
					})
					.catch(e => {
						this.errors.push(e)
					})
			} catch (err) {

				console.log("Se obtuvo el siguiente error al traer los usuarios: " + err)
			}
		},

		createUser(state, new_user) {
			try {
				axios.post('http://localhost:8081/user/registeruser/', new_user)
					.then(response => {
						console.log(response.status)
					})
					.catch(function (error) {
						console.log(error);
					});
			} catch (err) {
				console.log("Se obtuvo el siguiente error al crear un usuario: " + err)
			}
		},
		avanzarFila() {
			console.log("Se avanza la fila")
		},
		ingresarFila() {
			try {
				axios.get('http://localhost:8081/queue/registerUserInQueue/')
					.then(response => {
						console.log(response.data);
					})
					.catch(e => {
						this.errors.push(e)
					})
			} catch (err) {

				console.log("Se obtuvo el siguiente error al ingresar un usuario a la fila: " + err)
			}
		},

	},
	actions: {},
	modules: {}
})