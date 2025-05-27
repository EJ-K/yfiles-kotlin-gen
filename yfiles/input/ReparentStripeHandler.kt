// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IStripe
import yfiles.lang.ClassMetadata

/**
 * Default implementation of the [IReparentStripeHandler] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeHandler">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ReparentStripeHandler] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeHandler%23ReparentStripeHandler-constructor-ReparentStripeHandler">Online Documentation</a>
 */
open external class ReparentStripeHandler () : IReparentStripeHandler {
  /**
   * Gets or sets the maximum nesting level the column hierarchy may acquire during a reparent gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeHandler%23maxColumnLevel">Online Documentation</a>
   */
  final var maxColumnLevel: Int
  
  /**
   * Gets or sets the maximum nesting level the row hierarchy may acquire during a reparent gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeHandler%23maxRowLevel">Online Documentation</a>
   */
  final var maxRowLevel: Int
  
  /**
   * Adjust the size of the source or the target stripe.
   * @param [context] The context that provides information about the user input.
   * @param [stripe] The stripe that will be reparented.
   * @param [newParent] The potential new parent.
   * @param [reparentPosition] Where to place the stripe as a result of the gesture that triggered the reparent operation.
   * @param [index] The index where the stripe should be inserted.
   * @param [originalStripeSize] The original size of `stripe`
   * @param [originalParentSize] The original size of `newParent`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeHandler%23ReparentStripeHandler-method-adjustSize">Online Documentation</a>
   */
  protected open fun adjustSize(
    context: IInputModeContext,
    stripe: IStripe,
    newParent: IStripe,
    reparentPosition: StripeReparentPolicy,
    index: Int,
    originalStripeSize: Double,
    originalParentSize: Double,
  )
  
  /**
   * Checks the constraints imposed by [maxRowLevel][ReparentStripeHandler] or [maxColumnLevel][ReparentStripeHandler] for a valid gesture.
   * @param [context] The context that provides information about the user input.
   * @param [stripe] The stripe that will be reparented.
   * @param [newParent] The potential new parent.
   * @param [index] The index where the stripe would be [reparented][ReparentStripeHandler]
   * @param [reparentPosition] Where to place the stripe as a result of the gesture that would be used for the [reparent][ReparentStripeHandler] operation.
   * @return `true` iff the resulting nesting depth is smaller than [maxRowLevel][ReparentStripeHandler] or [maxColumnLevel][ReparentStripeHandler], or if the nesting depth would not increase by the operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeHandler%23ReparentStripeHandler-method-isValidParent">Online Documentation</a>
   */
  override fun isValidParent(
    context: IInputModeContext,
    stripe: IStripe,
    newParent: IStripe,
    index: Int,
    reparentPosition: StripeReparentPolicy,
  ): Boolean
  
  /**
   * Performs the actual reparenting after the reparent gesture has been finalized.
   * @param [context] The context that provides information about the user input.
   * @param [movedStripe] The stripe that will be reparented.
   * @param [newParent] The potential new parent.
   * @param [index] The index where the stripe should be inserted.
   * @param [reparentPosition] Where to place the stripe as a result of the gesture that triggered the reparent operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeHandler%23ReparentStripeHandler-method-reparent">Online Documentation</a>
   */
  override fun reparent(
    context: IInputModeContext,
    movedStripe: IStripe,
    newParent: IStripe,
    index: Int,
    reparentPosition: StripeReparentPolicy,
  )
  
  /**
   * Determines whether the user may detach the given stripe from its current parent in order to reparent it.
   * @param [context] The context that provides information about the user input.
   * @param [stripe] The stripe that is about to be detached from its current parent.
   * @return This implementation returns always `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripeHandler%23ReparentStripeHandler-method-shouldReparent">Online Documentation</a>
   */
  override fun shouldReparent(
    context: IInputModeContext,
    stripe: IStripe,
  ): Boolean
  
  companion object : ClassMetadata<ReparentStripeHandler> {
  }
}

inline fun ReparentStripeHandler(
    block: ReparentStripeHandler.() -> Unit
): ReparentStripeHandler {
    return ReparentStripeHandler()
        .apply(block)
}
