# -- get all posts by title or description
# SELECT title, description FROM ads WHERE title LIKE '%post%' or ads.description LIKE '%post%';
#
# -- get a single add with the username who created it
# SELECT ads.title, ads.description, u.username FROM ads JOIN users u on u.id = ads.user_id WHERE ads.id =1;
#
# -- get all the post with the username of the creator
# SELECT u.*, a.& FROM users u JOIN ads a on u.id = a.user_id WHERE u.username = 'fer';
