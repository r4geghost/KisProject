<template>
  <div id="app">
  <hello-world></hello-world>
  <vagon-list></vagon-list>
  </div>
</template>

<script>
import HelloWorld from "@/components/HelloWorld"
import VagonList from "@/components/VagonList"

export default {
  components: {
    HelloWorld,
    VagonList
  },
  async mounted() {
    this.$store.dispatch("loadVagonList")
  }
}

</script>

<style lang="less">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
