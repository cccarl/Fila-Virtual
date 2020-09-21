<template>
  <div class="fila">
    <Header msgBoton1="Perfil" msgBoton2="Salir"/>
    <FilaComponent />
  </div>
</template>

<script>
import Header from "@/components/Header.vue";
import FilaComponent from "@/components/FilaComponent.vue";

export default {
  name: "Fila",
  components: {
    Header,
    FilaComponent,
  },
};
</script>

<style scoped>
</style>
