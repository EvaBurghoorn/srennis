import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container, Row, Col } from 'react-bootstrap';
import { useState, useEffect } from 'react';


function Trees(){
    const [trees, setTrees] = useState("Hallo Eva");
   
    async function fetchData() {
        const response = await fetch('http://localhost:8080/profile');
        setTrees(await response.json());
      }

    useEffect(() => {
            fetchData();
            
      }, []);
      
    
      const numberOfOaks = trees.Oak
      for (let i = 0; i < numberOfOaks; i++) {
        (
            <div>
                <img 
                src="/images/tree.jpg" alt="Oak" width="200" height="200"/>
                </div>

        )
      }
   
      return (
        <Container>
            <Row>
            <h3>Je hebt {numberOfOaks} eiken</h3>
            </Row>
            <Row>
  

                <Col><img src="/images/tree.jpg" alt="Oak" width="100" height="100"/></Col>
                <Col><img src="/images/tree.jpg" alt="Oak" width="100" height="100"/></Col>
                <Col><img src="/images/tree.jpg" alt="Oak" width="100" height="100"/></Col>
                <Col><img src="/images/tree.jpg" alt="Oak" width="100" height="100"/></Col>
                <Col><img src="/images/tree.jpg" alt="Oak" width="100" height="100"/></Col>
                <Col><img src="/images/tree.jpg" alt="Oak" width="100" height="100"/></Col>
                <Col><img src="/images/tree.jpg" alt="Oak" width="100" height="100"/></Col>


            </Row>
        </Container>
    )
}

export default Trees;
