SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA
WHERE (GENOTYPE & 1 = 1 OR GENOTYPE & 4 = 4)
  AND (GENOTYPE & 2 = 0);
