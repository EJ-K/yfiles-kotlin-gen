// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IPort
import yfiles.graph.IPortLocationModelParameter
import yfiles.graph.IPortOwner
import yfiles.graph.Tag
import yfiles.lang.InterfaceMetadata

/**
 * An interface for possible [IPort] candidates used by [IPortCandidateProvider] and the like.
 * @see [IEdgeReconnectionPortCandidateProvider]
 * @see [IPortCandidateProvider]
 * @see [PortCandidate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidate">Online Documentation</a>
 */
external interface IPortCandidate  {
  /**
   * Gets a user-defined tag for this candidate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidate%23candidateTag">Online Documentation</a>
   */
  val candidateTag: Tag?
  
  /**
   * Gets the model parameter that will be used for the [locationParameter][IPort] if this candidate is chosen.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidate%23locationParameter">Online Documentation</a>
   */
  val locationParameter: IPortLocationModelParameter
  
  /**
   * Gets the possible owner of the port to be created for this candidate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidate%23owner">Online Documentation</a>
   */
  val owner: IPortOwner
  
  /**
   * Gets the port instance that is already live in the graph if this candidate wraps an existing port or `null` otherwise.
   * @see [createPort]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidate%23port">Online Documentation</a>
   */
  val port: IPort?
  
  /**
   * Gets whether this instance is a valid port candidate.
   * @see [getPortCandidateAt]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidate%23validity">Online Documentation</a>
   */
  val validity: PortCandidateValidity
  
  /**
   * If the client decides to use this port candidate, this method will serve as a factory to create the instance.
   * @param [context] The input mode context for which the port will be created. Implementations can depend on it providing an [IGraph][yfiles.graph.IGraph] instance in the lookup of the instance.
   * @return The port instance to use if this candidate has been chosen. This method may not return `null`.
   * @throws NotSupportedError If the [validity][IPortCandidate] is [DYNAMIC][PortCandidateValidity].
   * @see [IInputModeContext.graph]
   * @see [port]
   * @see [getPortCandidateAt]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidate%23IPortCandidate-method-createPort">Online Documentation</a>
   */
  fun createPort(
    context: IInputModeContext,
  ): IPort
  
  /**
   * Returns a candidate that is derived from this instance that best fits the provided `location`.
   * @param [context] The input mode context for which a concrete candidate is queried.
   * @param [location] The location for which a candidate should be returned.
   * @return A [IPortCandidate] implementation whose [validity][IPortCandidate] is guaranteed to be non-[DYNAMIC][PortCandidateValidity].
   * @see [validity]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidate%23IPortCandidate-method-getPortCandidateAt">Online Documentation</a>
   */
  fun getPortCandidateAt(
    context: IInputModeContext,
    location: Point,
  ): IPortCandidate

  
  companion object : InterfaceMetadata<IPortCandidate> {
  }
}
