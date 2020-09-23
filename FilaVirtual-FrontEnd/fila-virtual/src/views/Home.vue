<template>
  <div class="home">
    <Header msgBoton1="Ingresar" msgBoton2="Registrarse"/>
    <router-link to="/fila">Fila->boton provisional</router-link><br>
    <router-link to="/tienda">Tienda->boton provisional</router-link>
  </div>
</template>

<script>
// @ is an alias to /src
import Header from "@/components/Header.vue";

export default {
  name: "Home",
  components: {
    Header,
  },
};
</script>
