SELECT 
    child.ITEM_ID, 
    child.ITEM_NAME, 
    child.RARITY
FROM 
    ITEM_TREE AS tree
JOIN 
    ITEM_INFO AS parent ON tree.PARENT_ITEM_ID = parent.ITEM_ID
JOIN 
    ITEM_INFO AS child ON tree.ITEM_ID = child.ITEM_ID
WHERE 
    parent.RARITY = 'RARE'
ORDER BY 
    child.ITEM_ID DESC;
