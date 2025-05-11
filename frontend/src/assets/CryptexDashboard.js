import React from 'react';
import '../cryptex.css';

const posts = [
  { id: 1, title: 'Crypto Market Insights', date: '2024-07-01', content: 'Our latest insights on the current state of the crypto market.' },
  { id: 2, title: 'Security Update', date: '2024-06-15', content: 'We have implemented new security measures for our platform.' },
];

const CryptexDashboard = () => {
  return (
    <div className="dashboard-container">
      <h1>Cryptex Dashboard</h1>
      <h2>Previous Posts</h2>
      <div className="posts-list">
        {posts.map(post => (
          <div className="post-card" key={post.id}>
            <h3>{post.title}</h3>
            <p><strong>Date:</strong> {post.date}</p>
            <p>{post.content}</p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default CryptexDashboard;
