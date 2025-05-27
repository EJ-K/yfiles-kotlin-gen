// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IContextLookup
import yfiles.collections.IContextLookupChainLink
import yfiles.collections.ILookupDecorator
import yfiles.collections.LookupDecorator
import yfiles.input.IBendCreator
import yfiles.input.IBendSelectionTester
import yfiles.input.IEdgePortHandleProvider
import yfiles.input.IEdgeReconnectionPortCandidateProvider
import yfiles.input.IEdgeSnapResultProvider
import yfiles.input.IEditLabelHelper
import yfiles.input.IHandleProvider
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.input.IOrthogonalEdgeHelper
import yfiles.input.IPortCandidateProvider
import yfiles.input.IPositionHandler
import yfiles.input.ISnapReferenceProvider
import yfiles.lang.ClassMetadata
import yfiles.lang.Func4
import yfiles.lang.IClassMetadata
import yfiles.view.IFocusRenderer
import yfiles.view.IHighlightRenderer
import yfiles.view.IObstacleProvider
import yfiles.view.ISelectionRenderer

/**
 * Helps in [decorating][ILookupDecorator] the [lookup][yfiles.collections.ILookup] method of [IEdge] instances by providing access to decorators for the most common types.
 * @see [GraphDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [EdgeDecorator] class.
 * @param [decorator] The decorator to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-constructor-EdgeDecorator">Online Documentation</a>
 */
external class EdgeDecorator (
  decorator: ILookupDecorator  = definedExternally,
)  {
  /**
   * Gets a [LookupDecorator] that decorates the [IBendCreator] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23bendCreator">Online Documentation</a>
   */
  final val bendCreator: LookupDecorator<IEdge, IBendCreator>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IBendSelectionTester] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23bendSelectionTester">Online Documentation</a>
   */
  final val bendSelectionTester: LookupDecorator<IEdge, IBendSelectionTester>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IClipboardHelper] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23clipboardHelper">Online Documentation</a>
   */
  final val clipboardHelper: LookupDecorator<IEdge, IClipboardHelper<IEdge, *>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IEditLabelHelper] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23editLabelHelper">Online Documentation</a>
   */
  final val editLabelHelper: LookupDecorator<IEdge, IEditLabelHelper>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IFocusRenderer] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23focusRenderer">Online Documentation</a>
   */
  final val focusRenderer: LookupDecorator<IEdge, IFocusRenderer<IEdge>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHandleProvider] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23handleProvider">Online Documentation</a>
   */
  final val handleProvider: LookupDecorator<IEdge, IHandleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHighlightRenderer] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23highlightRenderer">Online Documentation</a>
   */
  final val highlightRenderer: LookupDecorator<IEdge, IHighlightRenderer<IEdge>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ILassoTestable] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23lassoTestable">Online Documentation</a>
   */
  final val lassoTestable: LookupDecorator<IEdge, ILassoTestable>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IMarqueeTestable] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23marqueeTestable">Online Documentation</a>
   */
  final val marqueeTestable: LookupDecorator<IEdge, IMarqueeTestable>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IMementoSupport] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23mementoSupport">Online Documentation</a>
   */
  final val mementoSupport: LookupDecorator<IEdge, IMementoSupport<IEdge, *>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IObstacleProvider] type for [IEdge]s this instance has been created for.
   * @see [GraphObstacleProvider][yfiles.view.GraphObstacleProvider]
   * @see [BridgeManager][yfiles.view.BridgeManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23obstacleProvider">Online Documentation</a>
   */
  final val obstacleProvider: LookupDecorator<IEdge, IObstacleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IOrthogonalEdgeHelper] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23orthogonalEdgeHelper">Online Documentation</a>
   */
  final val orthogonalEdgeHelper: LookupDecorator<IEdge, IOrthogonalEdgeHelper>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IPortCandidateProvider] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23portCandidateProvider">Online Documentation</a>
   */
  final val portCandidateProvider: LookupDecorator<IEdge, IPortCandidateProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IEdgePortHandleProvider] type for [IEdge]s this instance has been created for.
   * @see [PortRelocationHandle][yfiles.input.PortRelocationHandle]
   * @see [IHandle][yfiles.input.IHandle]
   * @see [IHandleProvider]
   * @see [OrthogonalEdgeEditingContext][yfiles.input.OrthogonalEdgeEditingContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23portHandleProvider">Online Documentation</a>
   */
  final val portHandleProvider: LookupDecorator<IEdge, IEdgePortHandleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23positionHandler">Online Documentation</a>
   */
  final val positionHandler: LookupDecorator<IEdge, IPositionHandler>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IEdgeReconnectionPortCandidateProvider] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23reconnectionPortCandidateProvider">Online Documentation</a>
   */
  final val reconnectionPortCandidateProvider: LookupDecorator<IEdge, IEdgeReconnectionPortCandidateProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ISelectionRenderer] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23selectionRenderer">Online Documentation</a>
   */
  final val selectionRenderer: LookupDecorator<IEdge, ISelectionRenderer<IEdge>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ISnapReferenceProvider] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23snapReferenceProvider">Online Documentation</a>
   */
  final val snapReferenceProvider: LookupDecorator<IEdge, ISnapReferenceProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IEdgeSnapResultProvider] type for [IEdge]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23snapResultProvider">Online Documentation</a>
   */
  final val snapResultProvider: LookupDecorator<IEdge, IEdgeSnapResultProvider>
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-method-add">Online Documentation</a>
   */
  fun add(
    link: IContextLookupChainLink<IEdge>,
  )
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    link: IContextLookupChainLink<IEdge>,
  )
  
  /**
   * Adds a generic callback as a chain link to the lookup.
   * @param [genericLink] The generic callback to add to the lookup chain.
   * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator] to the lookup.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-method-addGenericLookup">Online Documentation</a>
   */
  fun addGenericLookup(
    genericLink: Func4<IEdge, IClassMetadata<*>, IContextLookup<*>, Any>,
  ): IContextLookupChainLink<*>
  
  /**
   * Creates a [LookupDecorator] for [IEdge]s that can be used to decorate `TInterface` types of the edges.
   * @param [TInterface] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @param [interfaceType] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @return A new [LookupDecorator] for the specified interface.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-method-getDecoratorFor">Online Documentation</a>
   */
  fun <TInterface> getDecoratorFor(
    interfaceType: IClassMetadata<TInterface>,
  ): LookupDecorator<IEdge, TInterface>
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for edges.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-method-remove">Online Documentation</a>
   */
  fun remove(
    link: IContextLookupChainLink<IEdge>,
  )
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for edges.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-method-remove">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    link: IContextLookupChainLink<IEdge>,
  )
  
  companion object : ClassMetadata<EdgeDecorator> {
  }
}

inline operator fun  EdgeDecorator.invoke(
    block: EdgeDecorator.() -> Unit
): EdgeDecorator = apply(block)
