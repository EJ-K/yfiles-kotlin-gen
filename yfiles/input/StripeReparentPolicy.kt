// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

/**
 * Enumeration for the possible results of a reparent gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeReparentPolicy">Online Documentation</a>
 */

sealed external class StripeReparentPolicy {
  /**
   * Add the moved stripe as a new child of the target stripe
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeReparentPolicy%23ADD_CHILD">Online Documentation</a>
   */
  object ADD_CHILD: StripeReparentPolicy
  
  /**
   * Insert the moved stripe before the target stripe
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeReparentPolicy%23INSERT_BEFORE">Online Documentation</a>
   */
  object INSERT_BEFORE: StripeReparentPolicy
  
  /**
   * Insert the moved stripe after the target stripe
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeReparentPolicy%23INSERT_AFTER">Online Documentation</a>
   */
  object INSERT_AFTER: StripeReparentPolicy
  
  /**
   * The current gesture would result in an invalid operation (such as trying to make a stripe to its own child).
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeReparentPolicy%23INVALID">Online Documentation</a>
   */
  object INVALID: StripeReparentPolicy
}
