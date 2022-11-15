import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container, Row, Col } from 'react-bootstrap';
// import Alert from 'react-bootstrap/Alert';
import Button from 'react-bootstrap/Button';
import Trees from './Trees';




function Profile() {
  return (
    <Container>
      <Row>
        <h1>Your magic forest</h1>
        <br />
        <Col>
        <Button variant="success">Plant een boom</Button>
        </Col>
        <br />

        <h2>Ecologische voetafdruk</h2>
        <hr />
        <h2>Badges</h2>

      

      </Row>
      <Row>
        <Col>

          <h3>Boom 1</h3>
          <Trees/>
          </Col>
      </Row>
    </Container>

    
  );
}

export default Profile;
