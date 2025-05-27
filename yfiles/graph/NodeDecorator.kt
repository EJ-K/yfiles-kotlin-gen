// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.input.IEditLabelHelper
import yfiles.input.IHandleProvider
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.input.INodeInsetsProvider
import yfiles.input.INodeReshapeSnapResultProvider
import yfiles.input.INodeSizeConstraintProvider
import yfiles.input.INodeSnapResultProvider
import yfiles.input.IPortCandidateProvider
import yfiles.input.IPositionHandler
import yfiles.input.IReshapeHandleProvider
import yfiles.input.IReshapeHandler
import yfiles.input.ISnapLineProvider
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.styles.IShapeGeometry
import yfiles.view.IFocusIndicatorInstaller
import yfiles.view.IHighlightIndicatorInstaller
import yfiles.view.IObstacleProvider
import yfiles.view.ISelectionIndicatorInstaller

/**
 * Helps in [decorating][ILookupDecorator.addLookup] the [ILookup.lookup] method of [INode] instances by providing access to decorators for the most common types.
 * @see [GraphDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [NodeDecorator] class.
 * @param [decorator] The decorator to use, which can be `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-constructor-NodeDecorator">Online Documentation</a>
 */
external  class NodeDecorator  ( decorator: ILookupDecorator?  = definedExternally) : YObject {

/**
 * Gets a [LookupDecorator] that decorates the [IClipboardHelper] type for [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23clipboardHelperDecorator">Online Documentation</a>
 */
final val clipboardHelperDecorator: LookupDecorator<INode, IClipboardHelper<INode, *>>
/**
 * Gets a [LookupDecorator] that decorates the [IEditLabelHelper] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23editLabelHelperDecorator">Online Documentation</a>
 */
final val editLabelHelperDecorator: LookupDecorator<INode, IEditLabelHelper>
/**
 * Gets a [LookupDecorator] that decorates the [IFocusIndicatorInstaller] type for [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23focusIndicatorDecorator">Online Documentation</a>
 */
final val focusIndicatorDecorator: LookupDecorator<INode, IFocusIndicatorInstaller<INode>>
/**
 * Gets a [LookupDecorator] that decorates the [IGroupBoundsCalculator] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23groupBoundsCalculatorDecorator">Online Documentation</a>
 */
final val groupBoundsCalculatorDecorator: LookupDecorator<INode, IGroupBoundsCalculator>
/**
 * Gets a [LookupDecorator] that decorates the [IHandleProvider] type for [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23handleProviderDecorator">Online Documentation</a>
 */
final val handleProviderDecorator: LookupDecorator<INode, IHandleProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IHighlightIndicatorInstaller] type for [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23highlightDecorator">Online Documentation</a>
 */
final val highlightDecorator: LookupDecorator<INode, IHighlightIndicatorInstaller<INode>>
/**
 * Gets a [LookupDecorator] that decorates the [INodeInsetsProvider] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23insetsProviderDecorator">Online Documentation</a>
 */
final val insetsProviderDecorator: LookupDecorator<INode, INodeInsetsProvider>
/**
 * Gets a [LookupDecorator] that decorates the [ILassoTestable] type for [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23lassoTestableDecorator">Online Documentation</a>
 */
final val lassoTestableDecorator: LookupDecorator<INode, ILassoTestable>
/**
 * Gets a [LookupDecorator] that decorates the [IMarqueeTestable] type for [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23marqueeTestableDecorator">Online Documentation</a>
 */
final val marqueeTestableDecorator: LookupDecorator<INode, IMarqueeTestable>
/**
 * Gets a [LookupDecorator] that decorates the [IMementoSupport] type for [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23mementoSupportDecorator">Online Documentation</a>
 */
final val mementoSupportDecorator: LookupDecorator<INode, IMementoSupport<INode, *>>
/**
 * Gets a [LookupDecorator] that decorates the [INodeReshapeSnapResultProvider] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23nodeReshapeSnapResultProviderDecorator">Online Documentation</a>
 */
final val nodeReshapeSnapResultProviderDecorator: LookupDecorator<INode, INodeReshapeSnapResultProvider>
/**
 * Gets a [LookupDecorator] that decorates the [INodeSnapResultProvider] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23nodeSnapResultProviderDecorator">Online Documentation</a>
 */
final val nodeSnapResultProviderDecorator: LookupDecorator<INode, INodeSnapResultProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IObstacleProvider] type for [INode]s this instance has been created for.
 * @see [GraphObstacleProvider][yfiles.view.GraphObstacleProvider]
 * @see [BridgeManager][yfiles.view.BridgeManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23obstacleProviderDecorator">Online Documentation</a>
 */
final val obstacleProviderDecorator: LookupDecorator<INode, IObstacleProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IPortCandidateProvider] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23portCandidateProviderDecorator">Online Documentation</a>
 */
final val portCandidateProviderDecorator: LookupDecorator<INode, IPortCandidateProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23positionHandlerDecorator">Online Documentation</a>
 */
final val positionHandlerDecorator: LookupDecorator<INode, IPositionHandler>
/**
 * Gets a [LookupDecorator] that decorates the [IReshapeHandleProvider] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23reshapeHandleProviderDecorator">Online Documentation</a>
 */
final val reshapeHandleProviderDecorator: LookupDecorator<INode, IReshapeHandleProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IReshapeHandler] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23reshapeHandlerDecorator">Online Documentation</a>
 */
final val reshapeHandlerDecorator: LookupDecorator<INode, IReshapeHandler>
/**
 * Gets a [LookupDecorator] that decorates the [ISelectionIndicatorInstaller] type for [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23selectionDecorator">Online Documentation</a>
 */
final val selectionDecorator: LookupDecorator<INode, ISelectionIndicatorInstaller<INode>>
/**
 * Gets a [LookupDecorator] that decorates the [IShapeGeometry] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23shapeGeometryDecorator">Online Documentation</a>
 */
final val shapeGeometryDecorator: LookupDecorator<INode, IShapeGeometry>
/**
 * Gets a [LookupDecorator] that decorates the [INodeSizeConstraintProvider] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23sizeConstraintProviderDecorator">Online Documentation</a>
 */
final val sizeConstraintProviderDecorator: LookupDecorator<INode, INodeSizeConstraintProvider>
/**
 * Gets a [LookupDecorator] that decorates the [ISnapLineProvider] type for the [INode]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23snapLineProviderDecorator">Online Documentation</a>
 */
final val snapLineProviderDecorator: LookupDecorator<INode, ISnapLineProvider<INode>>
/**
 * Creates a [LookupDecorator] for [INode]s that can be used to decorate `TInterface` types of the nodes.
 * @param [TInterface] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [type] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [decorateNulls] if set to `true` `null` values will be decorated, otherwise not.
 * @param [nullIsFallback] if set to `true` `null` values will be treated as fallback values, otherwise they will be used as the final result.
 * @return A new [LookupDecorator] for the specified interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-method-getDecoratorFor">Online Documentation</a>
 */
 final   fun <TInterface : YObject>getDecoratorFor( type: YClass<TInterface> ,
 decorateNulls: Boolean  = definedExternally,
 nullIsFallback: Boolean  = definedExternally):LookupDecorator<INode, TInterface>
/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for nodes.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-method-remove">Online Documentation</a>
 */
 final   fun remove( lookup: IContextLookupChainLink<INode> )

/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for nodes.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDecorator%23NodeDecorator-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( lookup: IContextLookupChainLink<INode> )

companion object : ClassMetadata<NodeDecorator> {
}
}

inline operator fun  NodeDecorator.invoke(
    block: NodeDecorator.() -> Unit
): NodeDecorator = apply(block)
