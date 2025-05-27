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
import yfiles.graph.INode
import yfiles.graph.IPortOwner
import yfiles.lang.InterfaceMetadata

/**
 * This interface is used to provide [IPortCandidate]s for a specific [IPortOwner].
 * @see [NodeDecorator.portCandidateProvider][yfiles.graph.NodeDecorator.portCandidateProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider">Online Documentation</a>
 */
external interface IPortCandidateProvider  {
  /**
   * Returns all source port candidates that belong to the context of this provider.
   * @param [context] The context for which the candidates should be provided.
   * @return An enumerable over all source port candidates that are associated with the current context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-method-getAllSourcePortCandidates">Online Documentation</a>
   */
  fun getAllSourcePortCandidates(
    context: IInputModeContext,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Returns all target port candidates that belong to the context of this provider.
   * @param [context] The context for which the candidates should be provided.
   * @return An enumerable over all target port candidates that are associated with the current context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-method-getAllTargetPortCandidates">Online Documentation</a>
   */
  fun getAllTargetPortCandidates(
    context: IInputModeContext,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Returns all port candidates that apply for the provided opposite port candidate.
   * @param [context] The context for which the candidates should be provided.
   * @param [target] The opposite port candidate.
   * @return An enumerable over all port candidates that are associated with the given opposite port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-method-getSourcePortCandidates">Online Documentation</a>
   */
  fun getSourcePortCandidates(
    context: IInputModeContext,
    target: IPortCandidate,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Returns all port candidates that apply for the provided opposite port candidate.
   * @param [context] The context for which the candidates should be provided.
   * @param [source] The opposite port candidate.
   * @return An enumerable over all port candidates that are associated with the given opposite port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-method-getTargetPortCandidates">Online Documentation</a>
   */
  fun getTargetPortCandidates(
    context: IInputModeContext,
    source: IPortCandidate,
  ): IEnumerable<IPortCandidate>

  
  companion object : InterfaceMetadata<IPortCandidateProvider> {
    /**
     * A generic implementation of the [IPortCandidateProvider] interface that provides no candidates.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23NO_CANDIDATES">Online Documentation</a>
     */
     val NO_CANDIDATES: IPortCandidateProvider
    
    /**
     * Creates a generic composite implementation for the [IPortCandidateProvider] interface.
     * @param [providers] The providers to create the composite from.
     * @return An instance of [IPortCandidateProvider] that combines the given providers.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-defaultmethod-combine(IEnumerable)">Online Documentation</a>
     */
    @JsName("combine")
    operator fun invoke(
      providers: IEnumerable<IPortCandidateProvider>,
    ): IPortCandidateProvider
    
    /**
     * Creates a generic composite implementation for the [IPortCandidateProvider] interface.
     * @param [providers] The providers to create the composite from.
     * @return An instance of [IPortCandidateProvider] that combines the given providers.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-defaultmethod-combine(IPortCandidateProvider[])">Online Documentation</a>
     */
    @JsName("combine")
    operator fun invoke(
      vararg providers: IPortCandidateProvider,
    ): IPortCandidateProvider
    
    /**
     * Creates an implementation of an [IPortCandidateProvider] that provides only the given port candidates.
     * @param [candidates] The port candidates the provider should provide.
     * @return An instance of [PortCandidateProviderBase] that returns the given port candidates.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-defaultmethod-fromCandidates(IPortCandidate[])">Online Documentation</a>
     */
    fun fromCandidates(
      vararg candidates: IPortCandidate,
    ): PortCandidateProviderBase
    
    /**
     * Creates an implementation of an [IPortCandidateProvider] that provides only the given port candidates.
     * @param [candidates] The port candidates the provider should provide.
     * @return An instance of [PortCandidateProviderBase] that returns the given port candidates.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-defaultmethod-fromCandidates(IEnumerable)">Online Documentation</a>
     */
    fun fromCandidates(
      candidates: IEnumerable<IPortCandidate>,
    ): PortCandidateProviderBase
    
    /**
     * Creates an implementation of the [IPortCandidateProvider] interface that returns the ports that exist in the given [ports][IPortOwner]'s [IPortOwner] collection.
     * @param [owner] The owner of the port collection.
     * @return An instance of [IPortCandidateProvider] that provides the ports from the owner's collection.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-defaultmethod-fromExistingPorts">Online Documentation</a>
     */
    fun fromExistingPorts(
      owner: IPortOwner,
    ): IPortCandidateProvider
    
    /**
     * Creates a trivial implementation of an [IPortCandidateProvider] that always returns exactly one candidate that is centered at the node's [layout][INode].
     * @param [node] The node to get the layout's center from.
     * @return An instance of [PortCandidateProviderBase] that returns the candidate centered at the node's [layout][INode].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-defaultmethod-fromNodeCenter">Online Documentation</a>
     */
    fun fromNodeCenter(
      node: INode,
    ): PortCandidateProviderBase
    
    /**
     * Creates an implementation of an [IPortCandidateProvider] that always returns a candidate that uses the default [locationParameter][yfiles.graph.IPortDefaults] for the corresponding [IPortDefaults][yfiles.graph.IPortDefaults].
     * @param [owner] The owner of the port.
     * @return An instance of [IPortCandidateProvider] that always returns a candidate that uses the default [locationParameter][yfiles.graph.IPortDefaults] for the corresponding [IPortDefaults][yfiles.graph.IPortDefaults].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-defaultmethod-fromPortDefaults">Online Documentation</a>
     */
    fun fromPortDefaults(
      owner: IPortOwner,
    ): IPortCandidateProvider
    
    /**
     * Creates an implementation of [IPortCandidateProvider] that works for [IPortOwner] implementations that have [IShapeGeometry][yfiles.styles.IShapeGeometry] instances in their lookup.
     * @param [owner] The owner to receive the shape geometry from
     * @param [ratios] A number of double values that are interpreted as ratio values between 0.0 and 1.0. If none are given, the provider inserts a port candidate at the center of each straight line segment.
     * @return An instance of [PortCandidateProviderBase] that provides the ports from the shape geometry.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-defaultmethod-fromShapeGeometry(IPortOwner,number[])">Online Documentation</a>
     */
    fun fromShapeGeometry(
      owner: IPortOwner,
      vararg ratios: Double,
    ): PortCandidateProviderBase
    
    /**
     * Creates an implementation of [IPortCandidateProvider] that works for [IPortOwner] implementations that have [IShapeGeometry][yfiles.styles.IShapeGeometry] instances in their lookup.
     * @param [owner] The owner to receive the shape geometry from
     * @param [addExistingPortsEnabled] Determines whether [existing ports should be added to the list of ports][PortCandidateProviderBase].
     * @param [minimumSegmentLength] The minimum length a segment needs to have in order to be used to add port candidates.
     * @param [ratios] A number of double values that are interpreted as ratio values between 0.0 and 1.0. If none are given, the provider inserts a port candidate at the center of each straight line segment.
     * @return An instance of [PortCandidateProviderBase] that provides the ports from the shape geometry.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-defaultmethod-fromShapeGeometry(IPortOwner,boolean,number,number[])">Online Documentation</a>
     */
    fun fromShapeGeometry(
      owner: IPortOwner,
      addExistingPortsEnabled: Boolean,
      minimumSegmentLength: Double,
      vararg ratios: Double,
    ): PortCandidateProviderBase
    
    /**
     * Creates an implementation of an [IPortCandidateProvider] that returns unoccupied ports at a given entity.
     * @param [owner] The owner to query the ports from.
     * @return An instance of [IPortCandidateProvider] that returns unoccupied ports.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateProvider%23IPortCandidateProvider-defaultmethod-fromUnoccupiedPorts">Online Documentation</a>
     */
    fun fromUnoccupiedPorts(
      owner: IPortOwner,
    ): IPortCandidateProvider
  }
}
