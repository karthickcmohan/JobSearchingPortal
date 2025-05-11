import React from 'react';
import '../innovate.css';

const posts = [
  { id: 1, title: 'Innovation Awards', date: '2024-07-01', content: 'We are proud to announce that we have won the innovation award.' },
  { id: 2, title: 'New Research Paper', date: '2024-06-15', content: 'Our latest research paper on innovation is now available.' },
];

const InnovateDashboard = () => {
  return (
    <div className="dashboard-container">
      <h1>Innovate Dashboard</h1>
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

export default InnovateDashboard;

