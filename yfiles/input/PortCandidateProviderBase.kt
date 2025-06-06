// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.collections.IList
import yfiles.geometry.Point
import yfiles.graph.IPort
import yfiles.graph.IPortLocationModelParameter
import yfiles.graph.IPortOwner
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.styles.IPortStyle

/**
 * An abstract base implementation of the [IPortCandidateProvider] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase">Online Documentation</a>
 */
abstract external class PortCandidateProviderBase  : IPortCandidateProvider {
  /**
   * Gets or sets the style to use for the creation of the port in [createInstance][PortCandidateProviderBase].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23style">Online Documentation</a>
   */
  final var style: IPortStyle?
  
  /**
   * Gets or sets the tag to assign to the port in [createInstance][PortCandidateProviderBase]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23tag">Online Documentation</a>
   */
  final var tag: Tag?
  
  /**
   * Adds candidates for all existing [ports][IPortOwner] of the `owner` to the provided list.
   * @param [owner] The port owner whose ports should be added.
   * @param [list] The list to add candidates for existing ports to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23PortCandidateProviderBase-method-addExistingPorts">Online Documentation</a>
   */
  protected open fun addExistingPorts(
    owner: IPortOwner,
    list: IList<out IPortCandidate>,
  )
  
  /**
   * Factory method that creates a candidate that will use the [createInstance][PortCandidateProviderBase] method of this instance to delegate [createPort][IPortCandidate] queries to.
   * @param [owner] The owner to use for the candidate.
   * @param [locationParameter] The location of the candidate. This instance is assigned by reference to the candidate.
   * @param [valid] Whether the port should be [VALID][PortCandidateValidity].
   * @return A candidate whose [createPort][IPortCandidate] method delegates to this instance's [createInstance][PortCandidateProviderBase].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23PortCandidateProviderBase-method-createCandidate">Online Documentation</a>
   */
  protected fun createCandidate(
    owner: IPortOwner,
    locationParameter: IPortLocationModelParameter,
    valid: Boolean  = definedExternally,
  ): PortCandidate
  
  /**
   * Callback method used by the ports created using the factory methods [createCandidate][PortCandidateProviderBase].
   * @param [context] The context in which the instance is created.
   * @param [candidate] The candidate to create a port for.
   * @return The new port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23PortCandidateProviderBase-method-createInstance">Online Documentation</a>
   */
  protected open fun createInstance(
    context: IInputModeContext,
    candidate: PortCandidate,
  ): IPort
  
  /**
   * Returns all source port candidates that belong to the context of this provider.
   * @return An enumerable over all source port candidates that are associated with the current context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23PortCandidateProviderBase-method-getAllSourcePortCandidates">Online Documentation</a>
   */
  override fun getAllSourcePortCandidates(
    context: IInputModeContext,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Returns all target port candidates that belong to the context of this provider.
   * @return An enumerable over all target port candidates that are associated with the current context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23PortCandidateProviderBase-method-getAllTargetPortCandidates">Online Documentation</a>
   */
  override fun getAllTargetPortCandidates(
    context: IInputModeContext,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Callback method used by the ports created using the factory methods [createCandidate][PortCandidateProviderBase].
   * @param [context] The context in which the instance is created.
   * @param [candidate] The candidate to create a port for.
   * @param [suggestedLocation] The location to get a candidate for.
   * @return The new candidate whose [validity][IPortCandidate] may not be [DYNAMIC][PortCandidateValidity].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23PortCandidateProviderBase-method-getPortCandidateAt">Online Documentation</a>
   */
  protected open fun getPortCandidateAt(
    context: IInputModeContext,
    candidate: PortCandidate,
    suggestedLocation: Point,
  ): IPortCandidate
  
  /**
   * Creates an enumeration of possibly port candidates.
   * @param [context] The context for which the candidates should be provided.
   * @return An enumerable collection of port candidates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23PortCandidateProviderBase-method-getPortCandidates">Online Documentation</a>
   */
  protected abstract fun getPortCandidates(
    context: IInputModeContext,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Returns all port candidates that apply for the provided opposite port candidate.
   * @return An enumerable over all port candidates that are associated with the given opposite port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23PortCandidateProviderBase-method-getSourcePortCandidates">Online Documentation</a>
   */
  override fun getSourcePortCandidates(
    context: IInputModeContext,
    target: IPortCandidate,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Returns all port candidates that apply for the provided opposite port candidate.
   * @return An enumerable over all port candidates that are associated with the given opposite port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateProviderBase%23PortCandidateProviderBase-method-getTargetPortCandidates">Online Documentation</a>
   */
  override fun getTargetPortCandidates(
    context: IInputModeContext,
    source: IPortCandidate,
  ): IEnumerable<IPortCandidate>
  
  companion object : ClassMetadata<PortCandidateProviderBase> {
  }
}
