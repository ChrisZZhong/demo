import React, {useState} from 'react';

const Demo = () => {
    const [name, setUsername] = useState('');
    const [email, setEmail] = useState('');
    const [message, setMessage] = useState('');
    const [response, setResponse] = useState('');
  
    const handleMessage = async (e) => {
      e.preventDefault();
      console.log(name, email, message);

      fetch("http://localhost:8080/message", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          name: name,
          email: email,
          message: message,
        }),
      })
        .then((response) => response.json())
        .then((data) => {
          console.log("Success:", data);
          setResponse("Message sent successfully");
        })
        .catch((error) => {
          console.error("Error:", error);
          setResponse("Message failed to send");
        });
    };


    return (
<div>
      <h2 >Message</h2>
      <form onSubmit={handleMessage}>
        <input
          type="text"
          placeholder="name"
          value={name}
          onChange={(e) => setUsername(e.target.value)}
        />
        <input
          type="email"
          placeholder="email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
        <input
          type="text"
          placeholder="message"
          value={message}
          onChange={(e) => setMessage(e.target.value)}
        />
        <button 
          type="submit"> submit
        </button>
      </form>
      <p>{response}</p>
    </div>
    );
}

export default Demo;