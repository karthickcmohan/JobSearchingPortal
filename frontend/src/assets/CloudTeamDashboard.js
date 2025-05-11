import React from 'react';
import '../cloudteam.css';

const posts = [
  { id: 1, title: 'Cloud Infrastructure Update', date: '2024-07-01', content: 'We have updated our cloud infrastructure to improve performance.' },
  { id: 2, title: 'New Features Released', date: '2024-06-15', content: 'We are excited to announce new features for our cloud platform.' },
  // Add more posts as needed
];

const CloudTeamDashboard = () => {
  return (
    <div className="dashboard-container">
      <h1>CloudTeam Dashboard</h1>
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

export default CloudTeamDashboard;
