WITH APNT AS (
    SELECT 
        APNT_NO, 
        PT_NO, 
        MCDP_CD, 
        MDDR_ID, 
        APNT_YMD
    FROM 
        APPOINTMENT
    WHERE 
        APNT_CNCL_YN = 'N'
        AND DATE_FORMAT(APNT_YMD, '%Y-%m-%d') = '2022-04-13'
        AND MCDP_CD = 'CS'
),
PTNAME AS (
    SELECT 
        APNT.APNT_NO, 
        PATIENT.PT_NAME, 
        APNT.PT_NO, 
        APNT.MCDP_CD, 
        APNT.MDDR_ID, 
        APNT.APNT_YMD
    FROM 
        PATIENT
    JOIN 
        APNT
    ON 
        APNT.PT_NO = PATIENT.PT_NO
)

SELECT 
    PTNAME.APNT_NO, 
    PTNAME.PT_NAME, 
    PTNAME.PT_NO, 
    PTNAME.MCDP_CD, 
    DOCTOR.DR_NAME, 
    PTNAME.APNT_YMD
FROM 
    DOCTOR
JOIN 
    PTNAME
ON 
    PTNAME.MDDR_ID = DOCTOR.DR_ID
ORDER BY 
    PTNAME.APNT_YMD ASC;
