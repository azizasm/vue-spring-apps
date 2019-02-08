<template>
  <div class="challenges">
    <h1>Create User</h1>

    <h3>Just some database interaction...</h3>

    <input type="text" v-model="challenges.firstName" placeholder="first name">
    <input type="text" v-model="challenges.lastName" placeholder="last name">

    <button @click="createUser()">Create User</button>

    <div v-if="showResponse"><h6>User created with Id: {{ response }}</h6></div>

    <button v-if="showResponse" @click="retrieveUser()">Retrieve challenges {{challenges.id}} data from database</button>

    <h4 v-if="showRetrievedUser">Retrieved User {{retrievedUser.firstName}} {{retrievedUser.lastName}}</h4>

  </div>
</template>

<script>
  // import axios from 'axios'
  import {AXIOS} from './http-common'

  export default {
    name: 'challenges',

    data () {
      return {
        response: [],
        errors: [],
        challenges: {
          lastName: '',
          firstName: '',
          id: 0
        },
        showResponse: false,
        retrievedUser: {},
        showRetrievedUser: false
      }
    },
    methods: {
      // Fetches posts when the component is created.
      createUser () {
        var params = new URLSearchParams()
        params.append('firstName', this.challenges.firstName)
        params.append('lastName', this.challenges.lastName)

        AXIOS.post(`/challenges`, params)
          .then(response => {
            // JSON responses are automatically parsed.
            this.response = response.data
            this.challenges.id = response.data
            console.log(response.data)
            this.showResponse = true
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      retrieveUser () {
        AXIOS.get(`/challenges/` + this.challenges.id)
          .then(response => {
            // JSON responses are automatically parsed.
            this.retrievedUser = response.data
            console.log(response.data)
            this.showRetrievedUser = true
          })
          .catch(e => {
            this.errors.push(e)
          })
      }
    }
  }

</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
