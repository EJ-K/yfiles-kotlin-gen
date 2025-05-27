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
 * Used by [CreateEdgeInputMode] to determine the [direction][EdgeDirectionPolicy] in which edges get created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDirectionPolicy">Online Documentation</a>
 */

sealed external class EdgeDirectionPolicy {
  /**
   * The default policy where edges can only be created from source to target port.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDirectionPolicy%23START_AT_SOURCE">Online Documentation</a>
   */
  object START_AT_SOURCE: EdgeDirectionPolicy
  
  /**
   * A policy where edges can only be created from target to source port in [reverse][CreateEdgeInputMode] direction.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDirectionPolicy%23START_AT_TARGET">Online Documentation</a>
   */
  object START_AT_TARGET: EdgeDirectionPolicy
  
  /**
   * A policy where edges will be created in the same direction as last time.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDirectionPolicy%23KEEP_DIRECTION">Online Documentation</a>
   */
  object KEEP_DIRECTION: EdgeDirectionPolicy
  
  /**
   * A policy where edges will be created in the direction depending on whether the creation started at a [source][IPortCandidateProvider] or [target][IPortCandidateProvider] [IPortCandidate].
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDirectionPolicy%23DETERMINE_FROM_PORT_CANDIDATES">Online Documentation</a>
   */
  object DETERMINE_FROM_PORT_CANDIDATES: EdgeDirectionPolicy
}
