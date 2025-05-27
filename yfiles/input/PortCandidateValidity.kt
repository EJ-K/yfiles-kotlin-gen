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
 * Enumeration for the different possible [validity][IPortCandidate] states.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateValidity">Online Documentation</a>
 */

sealed external class PortCandidateValidity {
  /**
   * The candidate is valid and can be used to connect an edge to.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateValidity%23VALID">Online Documentation</a>
   */
  object VALID: PortCandidateValidity
  
  /**
   * The candidate should not be used to connect an edge to.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateValidity%23INVALID">Online Documentation</a>
   */
  object INVALID: PortCandidateValidity
  
  /**
   * The candidate cannot be used to create a port, instead [getPortCandidateAt][IPortCandidate] needs to be called to obtain a [IPortCandidate] that is either [VALID][PortCandidateValidity] or [INVALID][PortCandidateValidity].
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateValidity%23DYNAMIC">Online Documentation</a>
   */
  object DYNAMIC: PortCandidateValidity
}
