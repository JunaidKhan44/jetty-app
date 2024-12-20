package com.jk.jetty.eg.model;

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

/**
 * @author Junaid.Khan
 */

@NoArgsConstructor
@AllArgsConstructor
data class Employee(
    val id: Long,
    val name: String,
    val position: String,
    val department: String
)
