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
import yfiles.lang.InterfaceMetadata

/**
 * Interface used for implementations that recognize, approve, and disapprove stripe reparenting gestures, as well as actually perform the reparenting.
 * @see [ReparentStripePositionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReparentStripeHandler">Online Documentation</a>
 */
external interface IReparentStripeHandler  {
  /**
   * Determines whether the provided node may be reparented to a `newParent`.
   * @param [context] The context that provides information about the user input.
   * @param [stripe] The stripe that will be reparented.
   * @param [newParent] The potential new parent.
   * @param [index] The index where the stripe would be [reparented][IReparentStripeHandler]
   * @param [reparentPosition] Where to place the stripe as a result of the gesture that would be used for the [reparent][IReparentStripeHandler] operation.
   * @return Whether `newParent` is a valid new parent for `stripe` for the given index and gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReparentStripeHandler%23IReparentStripeHandler-method-isValidParent">Online Documentation</a>
   */
  fun isValidParent(
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
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReparentStripeHandler%23IReparentStripeHandler-method-reparent">Online Documentation</a>
   */
  fun reparent(
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
   * @return Whether the stripe may be detached and reparented.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReparentStripeHandler%23IReparentStripeHandler-method-shouldReparent">Online Documentation</a>
   */
  fun shouldReparent(
    context: IInputModeContext,
    stripe: IStripe,
  ): Boolean

  
  companion object : InterfaceMetadata<IReparentStripeHandler> {
  }
}
