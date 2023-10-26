<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/BanqueService">
		<html>
		<head></head>
			<body>
				<h1>Liste des comptes</h1>
				<table>
					
					<xsl:for-each select="getComptes">	
					<xsl:variable name="year" select="substring(dataCreation, 1, 4)" />
            		<xsl:if test="$year > $yearThreshold">				
							<tr>
								<td>
									<xsl:value-of select="code" />
								</td>
								<td>
									<xsl:value-of select="solde" />
								</td>
								<td>
									<xsl:value-of select="dataCreation" />
								</td>
							</tr>
						</xsl:if>
					</xsl:for-each>
				</table>				
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>