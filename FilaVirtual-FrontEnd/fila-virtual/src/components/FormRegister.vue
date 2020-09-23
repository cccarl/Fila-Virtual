<template>
  <div class="formRegister">
    <div>
      <form>
        <h1 class="titleRegister">Crear una cuenta</h1>
        <input v-model="new_user.names" placeholder="Nombre" type="text" required/>
        <input v-model="new_user.surnames" placeholder="Apellido" type="text" required/>
        <input v-model="new_user.rut" placeholder="Rut" type="text" required/>
        <input v-model="new_user.email" placeholder="Email" type="email" required/>
        <input v-model="new_user.phoneNum" placeholder="Número de celular" type="text" required/>
        <input placeholder="Contraseña" type="password" required/>
        <input v-model="new_user.password" placeholder="Confirmación de contraseña" type="password" required/>

        <router-link to="/successregister">
          <button v-on:click="create_user" class="btn btnRigth">Aceptar</button>
        </router-link>

        <router-link to="/">
          <button class="btn btnRigth">Cancelar</button>
        </router-link>
      </form>
    </div>
  </div>
</template>

<script>
import  { mapState, mapMutations }  from "vuex";

export default {
  name: "FormRegister",
  props: {},
  data: () => ({
    new_user: {
      rut: null,
      names: null,
      surnames: null,
      email: null,
      password: null,
      phoneNum: null,
      role: "user"
    }
  }),

  computed: {
    ...mapState(["users"]),
  },

  methods: {
    // Se importan lo metodos del store
    ...mapMutations(["createUser"]),

    // Metodo para comprobar los datos ingresados.
    complete(new_user) {
      if (new_user.names == null || new_user.surnames == null || new_user.email == null || new_user.password == null || new_user.phoneNum == null){
        return false
      }
      return true
    },

    // Envia el usuario para ser ingresado al back
    create_user() {
      if (this.complete(this.new_user)) {
        this.createUser(this.new_user)
      }
    },
  }
};
</script>

<style>
form {
  background: #f1faee;
  border-radius: 6px;
  padding: 10px;
  padding-top: 30px;
  width: 80%;
  margin: 50px auto;
  box-shadow: 15px 15px 10px rgba(0, 0, 0, 0.1);
  overflow: hidden;
}
input {
  width: 90%;
  background: #ffffff;
  border: solid #6da1b6;
  padding: 20px;
  border-radius: 6px;
  margin-bottom: 10px;
  border: 1px solid #eee;
  font-size: 20px;
}
.btn {
  position: static;
  width: 150px;
  padding: 10px;
  margin: 5px;
  border-radius: 6px;
  border: 0;
  border: 2px solid #af4d49;
  background: #f26964;
  font-size: 1.2em;
  color: #fff;
  text-shadow: 1px 1px 0px rgba(0, 0, 0, 0.1);
}
.btn:active {
  background: #af4d49;
}

.btnRigth {
  float: right;
}

.titleRegister {
  margin: 0px 0px 30px 0px;
}

article,
aside,
details,
figcaption,
figure,
footer,
header,
hgroup,
nav,
section {
  display: block;
}

input:focus,
textarea:focus {
  outline: none;
}

label,
select,
button,
input[type="submit"],
input[type="radio"],
input[type="checkbox"] input[type="button"] {
  cursor: pointer;
}

* {
  margin: 0;
  padding: 0;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}

* {
  font-family: "Helvetica Neue", Helvetica, Arial;
}
</style>