<template>
  <div class="home">
    <div>
      <Header msgBoton1="Ingresar" msgBoton2="Registrarse"/>
    </div>
    <div class="grid-container">
      <div class="grid-item">
        <a href= "/#/tienda">
          <img class="imgTienda" src="../assets/tienda1.jpg" width="300" height="200" />  
        </a>
          <p>Almacen Anita</p>
      </div>
      <div class="grid-item">
        <img class="imgTienda" src="../assets/tienda2.jpg" width="300" height="200" />  
        <p>Almacen Donde la Anita</p>
        
      </div>
      <div class="grid-item">
        <img class="imgTienda" src="../assets/tienda3.jpg" width="300" height="200" />  
        <p>Almacen Donde la Menche</p>
      </div>
    </div>
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
<style>
  .grid-container{   
    background: #f1faee;
    border-radius: 6px;
    padding: 10px;
    padding-top: 30px;
    width: 80%;
    margin: 50px auto;
    box-shadow: 15px 15px 10px rgba(0, 0, 0, 0.1);
    display: grid;
    grid-template-columns: auto auto auto;
  }
  .grid-item{
    background: #a8dadc;
    border-radius: 4px;
    padding: 10px;
    width: 87%;
    margin: auto;
    float: left;
    font-size: 30px;
  }
</style>