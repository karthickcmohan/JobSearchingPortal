import React from 'react';
import '../nextgen.css';

const posts = [
  { id: 1, title: 'NextGen Technology Expo', date: '2024-07-01', content: 'Visit us at the NextGen Technology Expo to learn about our new products.' },
  { id: 2, title: 'Sustainability Report', date: '2024-06-15', content: 'We have published our annual sustainability report.' },
];

const NextGenDashboard = () => {
  return (
    <div className="dashboard-container">
      <h1>NextGen Dashboard</h1>
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

export default NextGenDashboard;

