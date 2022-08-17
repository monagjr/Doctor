package org.empowrco.doctor.db

object Assignments : BaseTable() {
    val referenceId = text("reference_id").uniqueIndex()
    val expectedOutput = text("expected_output")
    val instructions = text("instructions")
    val totalAttempts = integer("total_attempts")
    val solution = text("solution")
    val successMessage = text("success_message")
    val failureMessage = text("failure_message")
}