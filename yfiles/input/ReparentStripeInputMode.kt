// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.ClassMetadata

/**
 * Specialized input mode that is used to reparent a stripe inside an [ITable][yfiles.graph.ITable] structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ReparentStripeInputMode] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeInputMode%23ReparentStripeInputMode-constructor-ReparentStripeInputMode">Online Documentation</a>
 */
external open class ReparentStripeInputMode  () : MoveInputMode {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeInputMode%23ReparentStripeInputMode-method-onDragCanceled">Online Documentation</a>
 */
 override   fun onDragCanceled( event: InputModeEventArgs )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeInputMode%23ReparentStripeInputMode-method-onDragFinished">Online Documentation</a>
 */
 override   fun onDragFinished( event: InputModeEventArgs )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeInputMode%23ReparentStripeInputMode-method-onDragStarting">Online Documentation</a>
 */
 override   fun onDragStarting( event: InputModeEventArgs )

companion object : ClassMetadata<ReparentStripeInputMode> {
}
}

inline fun ReparentStripeInputMode(
    block: ReparentStripeInputMode.() -> Unit
): ReparentStripeInputMode {
    return ReparentStripeInputMode()
        .apply(block)
}
