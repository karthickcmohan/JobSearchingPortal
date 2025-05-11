import React from 'react';
import '../creativemind.css';

const posts = [
  { id: 1, title: 'New Creative Campaign', date: '2024-07-01', content: 'We have launched a new creative campaign for our clients.' },
  { id: 2, title: 'Creative Workshop', date: '2024-06-15', content: 'Join our upcoming creative workshop to learn new skills.' },
];

const CreativeMindDashboard = () => {
  return (
    <div className="dashboard-container">
      <h1>CreativeMind Dashboard</h1>
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

export default CreativeMindDashboard;
