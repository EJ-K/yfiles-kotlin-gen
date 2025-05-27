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
import yfiles.input.IEditLabelHelper
import yfiles.input.IGroupPaddingProvider
import yfiles.input.IHandleProvider
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.input.INodeReshapeSnapResultProvider
import yfiles.input.INodeSizeConstraintProvider
import yfiles.input.INodeSnapResultProvider
import yfiles.input.IPortCandidateProvider
import yfiles.input.IPositionHandler
import yfiles.input.IReshapeHandleProvider
import yfiles.input.IReshapeHandler
import yfiles.input.ISnapReferenceProvider
import yfiles.lang.ClassMetadata
import yfiles.lang.Func4
import yfiles.lang.IClassMetadata
import yfiles.styles.IShapeGeometry
import yfiles.view.IFocusRenderer
import yfiles.view.IHighlightRenderer
import yfiles.view.IObstacleProvider
import yfiles.view.ISelectionRenderer

/**
 * Helps in [decorating][ILookupDecorator] the [lookup][yfiles.collections.ILookup] method of [INode] instances by providing access to decorators for the most common types.
 * @see [GraphDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [NodeDecorator] class.
 * @param [decorator] The decorator to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-constructor-NodeDecorator">Online Documentation</a>
 */
external class NodeDecorator (
  decorator: ILookupDecorator  = definedExternally,
)  {
  /**
   * Gets a [LookupDecorator] that decorates the [IClipboardHelper] type for [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23clipboardHelper">Online Documentation</a>
   */
  final val clipboardHelper: LookupDecorator<INode, IClipboardHelper<INode, *>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IEditLabelHelper] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23editLabelHelper">Online Documentation</a>
   */
  final val editLabelHelper: LookupDecorator<INode, IEditLabelHelper>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IFocusRenderer] type for [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23focusRenderer">Online Documentation</a>
   */
  final val focusRenderer: LookupDecorator<INode, IFocusRenderer<INode>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IGroupBoundsCalculator] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23groupBoundsCalculator">Online Documentation</a>
   */
  final val groupBoundsCalculator: LookupDecorator<INode, IGroupBoundsCalculator>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IGroupPaddingProvider] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23groupPaddingProvider">Online Documentation</a>
   */
  final val groupPaddingProvider: LookupDecorator<INode, IGroupPaddingProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHandleProvider] type for [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23handleProvider">Online Documentation</a>
   */
  final val handleProvider: LookupDecorator<INode, IHandleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHighlightRenderer] type for [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23highlightRenderer">Online Documentation</a>
   */
  final val highlightRenderer: LookupDecorator<INode, IHighlightRenderer<INode>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ILassoTestable] type for [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23lassoTestable">Online Documentation</a>
   */
  final val lassoTestable: LookupDecorator<INode, ILassoTestable>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IMarqueeTestable] type for [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23marqueeTestable">Online Documentation</a>
   */
  final val marqueeTestable: LookupDecorator<INode, IMarqueeTestable>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IMementoSupport] type for [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23mementoSupport">Online Documentation</a>
   */
  final val mementoSupport: LookupDecorator<INode, IMementoSupport<INode, *>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IObstacleProvider] type for [INode]s this instance has been created for.
   * @see [GraphObstacleProvider][yfiles.view.GraphObstacleProvider]
   * @see [BridgeManager][yfiles.view.BridgeManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23obstacleProvider">Online Documentation</a>
   */
  final val obstacleProvider: LookupDecorator<INode, IObstacleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IPortCandidateProvider] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23portCandidateProvider">Online Documentation</a>
   */
  final val portCandidateProvider: LookupDecorator<INode, IPortCandidateProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23positionHandler">Online Documentation</a>
   */
  final val positionHandler: LookupDecorator<INode, IPositionHandler>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IReshapeHandleProvider] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23reshapeHandleProvider">Online Documentation</a>
   */
  final val reshapeHandleProvider: LookupDecorator<INode, IReshapeHandleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IReshapeHandler] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23reshapeHandler">Online Documentation</a>
   */
  final val reshapeHandler: LookupDecorator<INode, IReshapeHandler>
  
  /**
   * Gets a [LookupDecorator] that decorates the [INodeReshapeSnapResultProvider] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23reshapeSnapResultProvider">Online Documentation</a>
   */
  final val reshapeSnapResultProvider: LookupDecorator<INode, INodeReshapeSnapResultProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ISelectionRenderer] type for [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23selectionRenderer">Online Documentation</a>
   */
  final val selectionRenderer: LookupDecorator<INode, ISelectionRenderer<INode>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IShapeGeometry] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23shapeGeometry">Online Documentation</a>
   */
  final val shapeGeometry: LookupDecorator<INode, IShapeGeometry>
  
  /**
   * Gets a [LookupDecorator] that decorates the [INodeSizeConstraintProvider] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23sizeConstraintProvider">Online Documentation</a>
   */
  final val sizeConstraintProvider: LookupDecorator<INode, INodeSizeConstraintProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ISnapReferenceProvider] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23snapReferenceProvider">Online Documentation</a>
   */
  final val snapReferenceProvider: LookupDecorator<INode, ISnapReferenceProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [INodeSnapResultProvider] type for the [INode]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23snapResultProvider">Online Documentation</a>
   */
  final val snapResultProvider: LookupDecorator<INode, INodeSnapResultProvider>
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-method-add">Online Documentation</a>
   */
  fun add(
    link: IContextLookupChainLink<INode>,
  )
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    link: IContextLookupChainLink<INode>,
  )
  
  /**
   * Adds a generic callback as a chain link to the lookup.
   * @param [genericLink] The generic callback to add to the lookup chain.
   * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator] to the lookup.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-method-addGenericLookup">Online Documentation</a>
   */
  fun addGenericLookup(
    genericLink: Func4<INode, IClassMetadata<*>, IContextLookup<*>, Any>,
  ): IContextLookupChainLink<*>
  
  /**
   * Creates a [LookupDecorator] for [INode]s that can be used to decorate `TInterface` types of the nodes.
   * @param [TInterface] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @param [interfaceType] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @return A new [LookupDecorator] for the specified interface.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-method-getDecoratorFor">Online Documentation</a>
   */
  fun <TInterface> getDecoratorFor(
    interfaceType: IClassMetadata<TInterface>,
  ): LookupDecorator<INode, TInterface>
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for nodes.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-method-remove">Online Documentation</a>
   */
  fun remove(
    link: IContextLookupChainLink<INode>,
  )
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for nodes.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-method-remove">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    link: IContextLookupChainLink<INode>,
  )
  
  companion object : ClassMetadata<NodeDecorator> {
  }
}

inline operator fun  NodeDecorator.invoke(
    block: NodeDecorator.() -> Unit
): NodeDecorator = apply(block)
