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
 * The policy constant used by [NodeReshapeHandleProvider] and [ReshapeHandlerHandle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy">Online Documentation</a>
 */

sealed external class ReshapePolicy {
  /**
   * The aspect ratio is ignored.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23NONE">Online Documentation</a>
   */
  object NONE: ReshapePolicy
  
  /**
   * Takes the larger of the two bounds that would result when taking the [HORIZONTAL][ReshapePolicy] and [VERTICAL][ReshapePolicy] policies.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23MAXIMUM">Online Documentation</a>
   */
  object MAXIMUM: ReshapePolicy
  
  /**
   * Takes the smaller of the two bounds that would result when taking the [HORIZONTAL][ReshapePolicy] and [VERTICAL][ReshapePolicy] policies.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23MINIMUM">Online Documentation</a>
   */
  object MINIMUM: ReshapePolicy
  
  /**
   * Considers only the horizontal part of the pointer movement.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23HORIZONTAL">Online Documentation</a>
   */
  object HORIZONTAL: ReshapePolicy
  
  /**
   * Considers only the vertical part of the pointer movement.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23VERTICAL">Online Documentation</a>
   */
  object VERTICAL: ReshapePolicy
  
  /**
   * Projects the pointer location onto the resize direction line.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23PROJECTION">Online Documentation</a>
   */
  object PROJECTION: ReshapePolicy
}
