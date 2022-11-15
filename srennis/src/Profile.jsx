import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container, Row, Col } from 'react-bootstrap';
import Alert from 'react-bootstrap/Alert';




function App() {
  return (
    <Container class="App">
      <Row>
        <h1>Your magic forest</h1>


        <button>Plant een boom</button>

        <h1>Ecologische voetafdruk</h1>

        <h1>Badges</h1>

        <Alert variant='warning'> bla bla </Alert>

      </Row>
    </Container>

    
  );
}

export default App;
