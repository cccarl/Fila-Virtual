<template>
  <div class="header">
    <img class="logo" src="../assets/logoFilaVirtual.png" />

    <router-link to="/register">
      <button class="btnHedaer">{{msgBoton2}}</button>
    </router-link>

    <router-link to="/">
      <button class="btnHedaer">{{msgBoton1}}</button>
    </router-link>
  </div>
</template>

<script>
export default {
  name: "Header",
  props: {
    msgBoton1: String,
    msgBoton2: String,
  },
};
</script>

<style>
.header {
  width: 80%;
  margin: 50px auto;
  overflow: hidden;
}

.logo {
  float: left;
  width: 40%;
  min-width: 180px;
  max-width: 250px;
}

.btnHedaer {
  position: static;
  width: 20%;
  max-width: 200px;
  min-width: 110px;
  padding: 4px;
  margin: 5px;
  border-radius: 6px;
  border: 0;
  border: 2px solid #af4d49;
  background: #f26964;
  font-size: 1.2em;
  color: #000;
  text-shadow: 1px 1px 0px rgba(0, 0, 0, 0.1);
  float: right;
}
.btnHedaer:active {
  background: #af4d49;
}
</style>