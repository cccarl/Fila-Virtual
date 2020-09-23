<template>
  <div class="filaComponent">
    <div class="titleFila">
      <h1>Fila del local</h1>
    </div>

    <button class="btnVerLocal btnViewQueue">Avanzar fila</button>

    <table style="width:100%">
      <tr>
        <th style="background-color: #ccc;">#</th>
        <th style="background-color: #ccc;">Nombre</th>
        <th style="background-color: #ccc;">Celular</th>
      </tr>

      <tr v-for="user in users" :key="user.id">
        <td>{{ user.names }}</td>
        <td>{{ user.names }}</td>
        <td>{{ user.phoneNum }}</td>
      </tr>
    </table>
    <router-link to="/tienda">
      <button class="btnVerLocal btnViewQueue">Ver local</button>
    </router-link>
    <button class="btnCerrar btnViewQueue">Cerrar fila</button>
  </div>
</template>

<script>
import { mapState, mapMutations } from "vuex";

export default {
  name: "FilaComponent",
  props: {},
  mounted() {
    this.get_users();
  },
  computed: {
    ...mapState(["users"]),
  },

  methods: {
    ...mapMutations(["getAllUsers"]),

    get_users() {
      this.getAllUsers();
    },
  },
};
</script>

<style>
.filaComponent {
  background: #f1faee;
  border-radius: 6px;
  padding: 40px;
  width: 80%;
  margin: 50px auto;
  box-shadow: 15px 15px 10px rgba(0, 0, 0, 0.1);
  overflow: hidden;
}
table,
th,
td {
  border: 1px solid black;
  border-collapse: collapse;
  padding: 15px;
  background-color: #ffffff;
}

.titleFila {
  background-color: #acdde6;
  padding: 10px;
  margin-bottom: 30px;
  border: 1px solid #000000;
}

.btnViewQueue {
  position: static;
  width: 150px;
  padding: 10px;
  margin: 20px;
  border-radius: 6px;
  font-size: 1.2em;
  color: #000;
  text-shadow: 1px 1px 0px rgba(0, 0, 0, 0.1);
  float: left;
}

.btnVerLocal {
  border: 2px solid #88b3bb;
  background: #acdde6;
}
.btnVerLocal:active {
  background: #88b3bb;
}

.btnCerrar {
  border: 2px solid #af4d49;
  background: #f26964;
}
.btnCerrar:active {
  background: #af4d49;
}
</style>