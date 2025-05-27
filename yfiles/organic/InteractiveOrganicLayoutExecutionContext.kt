// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A [InteractiveOrganicLayoutExecutionContext] provides control over the layout calculation in the case of single-threaded algorithm execution.
 * @see [InteractiveOrganicLayout.startLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayoutExecutionContext">Online Documentation</a>
 */
external interface InteractiveOrganicLayoutExecutionContext : YObject {
/**
 * Starts the layout calculation, continuing where it has stopped before and allowing a certain maximum duration in milliseconds.
 * @param [duration] the duration in milliseconds the layout calculation is allowed to run
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayoutExecutionContext%23InteractiveOrganicLayoutExecutionContext-method-continueLayout">Online Documentation</a>
 */
   fun continueLayout( duration: Double )
/**
 * Stops the layout calculation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteractiveOrganicLayoutExecutionContext%23InteractiveOrganicLayoutExecutionContext-method-stopLayout">Online Documentation</a>
 */
   fun stopLayout()

companion object : InterfaceMetadata<InteractiveOrganicLayoutExecutionContext> {
}
}
