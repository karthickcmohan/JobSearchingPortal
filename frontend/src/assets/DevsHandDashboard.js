import React from 'react';
import '../devshand.css';

const posts = [
  { id: 1, title: 'Developer Conference', date: '2024-07-01', content: 'Join us at the annual developer conference this year.' },
  { id: 2, title: 'Open Source Contributions', date: '2024-06-15', content: 'We have made significant contributions to open source projects.' },
];

const DevsHandDashboard = () => {
  return (
    <div className="dashboard-container">
      <h1>DevsHand Dashboard</h1>
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

export default DevsHandDashboard;
