// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

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
import yfiles.input.ISnapLineProvider
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.IFocusIndicatorInstaller
import yfiles.view.IHighlightIndicatorInstaller
import yfiles.view.IObstacleProvider
import yfiles.view.ISelectionIndicatorInstaller

/**
 * Helps in [decorating][ILookupDecorator.addLookup] the [ILookup.lookup] method of [IEdge] instances by providing access to decorators for the most common types.
 * @see [GraphDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [EdgeDecorator] class.
 * @param [decorator] The decorator to use, which can be `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-constructor-EdgeDecorator">Online Documentation</a>
 */
external  class EdgeDecorator  ( decorator: ILookupDecorator?  = definedExternally) : YObject {

/**
 * Gets a [LookupDecorator] that decorates the [IBendCreator] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23bendCreatorDecorator">Online Documentation</a>
 */
final val bendCreatorDecorator: LookupDecorator<IEdge, IBendCreator>
/**
 * Gets a [LookupDecorator] that decorates the [IBendSelectionTester] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23bendSelectionTesterDecorator">Online Documentation</a>
 */
final val bendSelectionTesterDecorator: LookupDecorator<IEdge, IBendSelectionTester>
/**
 * Gets a [LookupDecorator] that decorates the [IClipboardHelper] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23clipboardHelperDecorator">Online Documentation</a>
 */
final val clipboardHelperDecorator: LookupDecorator<IEdge, IClipboardHelper<IEdge, *>>
/**
 * Gets a [LookupDecorator] that decorates the [IEdgePortHandleProvider] type for [IEdge]s this instance has been created for.
 * @see [PortRelocationHandle][yfiles.input.PortRelocationHandle]
 * @see [IHandle][yfiles.input.IHandle]
 * @see [IHandleProvider]
 * @see [OrthogonalEdgeEditingContext][yfiles.input.OrthogonalEdgeEditingContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23edgePortHandleProviderDecorator">Online Documentation</a>
 */
final val edgePortHandleProviderDecorator: LookupDecorator<IEdge, IEdgePortHandleProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IEdgeReconnectionPortCandidateProvider] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23edgeReconnectionPortCandidateProviderDecorator">Online Documentation</a>
 */
final val edgeReconnectionPortCandidateProviderDecorator: LookupDecorator<IEdge, IEdgeReconnectionPortCandidateProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IEdgeSnapResultProvider] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23edgeSnapResultProviderDecorator">Online Documentation</a>
 */
final val edgeSnapResultProviderDecorator: LookupDecorator<IEdge, IEdgeSnapResultProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IEditLabelHelper] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23editLabelHelperDecorator">Online Documentation</a>
 */
final val editLabelHelperDecorator: LookupDecorator<IEdge, IEditLabelHelper>
/**
 * Gets a [LookupDecorator] that decorates the [IFocusIndicatorInstaller] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23focusIndicatorDecorator">Online Documentation</a>
 */
final val focusIndicatorDecorator: LookupDecorator<IEdge, IFocusIndicatorInstaller<IEdge>>
/**
 * Gets a [LookupDecorator] that decorates the [IHandleProvider] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23handleProviderDecorator">Online Documentation</a>
 */
final val handleProviderDecorator: LookupDecorator<IEdge, IHandleProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IHighlightIndicatorInstaller] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23highlightDecorator">Online Documentation</a>
 */
final val highlightDecorator: LookupDecorator<IEdge, IHighlightIndicatorInstaller<IEdge>>
/**
 * Gets a [LookupDecorator] that decorates the [ILassoTestable] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23lassoTestableDecorator">Online Documentation</a>
 */
final val lassoTestableDecorator: LookupDecorator<IEdge, ILassoTestable>
/**
 * Gets a [LookupDecorator] that decorates the [IMarqueeTestable] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23marqueeTestableDecorator">Online Documentation</a>
 */
final val marqueeTestableDecorator: LookupDecorator<IEdge, IMarqueeTestable>
/**
 * Gets a [LookupDecorator] that decorates the [IMementoSupport] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23mementoSupportDecorator">Online Documentation</a>
 */
final val mementoSupportDecorator: LookupDecorator<IEdge, IMementoSupport<IEdge, *>>
/**
 * Gets a [LookupDecorator] that decorates the [IObstacleProvider] type for [IEdge]s this instance has been created for.
 * @see [GraphObstacleProvider][yfiles.view.GraphObstacleProvider]
 * @see [BridgeManager][yfiles.view.BridgeManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23obstacleProviderDecorator">Online Documentation</a>
 */
final val obstacleProviderDecorator: LookupDecorator<IEdge, IObstacleProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IOrthogonalEdgeHelper] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23orthogonalEdgeHelperDecorator">Online Documentation</a>
 */
final val orthogonalEdgeHelperDecorator: LookupDecorator<IEdge, IOrthogonalEdgeHelper>
/**
 * Gets a [LookupDecorator] that decorates the [IPortCandidateProvider] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23portCandidateProviderDecorator">Online Documentation</a>
 */
final val portCandidateProviderDecorator: LookupDecorator<IEdge, IPortCandidateProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23positionHandlerDecorator">Online Documentation</a>
 */
final val positionHandlerDecorator: LookupDecorator<IEdge, IPositionHandler>
/**
 * Gets a [LookupDecorator] that decorates the [ISelectionIndicatorInstaller] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23selectionDecorator">Online Documentation</a>
 */
final val selectionDecorator: LookupDecorator<IEdge, ISelectionIndicatorInstaller<IEdge>>
/**
 * Gets a [LookupDecorator] that decorates the [ISnapLineProvider] type for [IEdge]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23snapLineProviderDecorator">Online Documentation</a>
 */
final val snapLineProviderDecorator: LookupDecorator<IEdge, ISnapLineProvider<IEdge>>
/**
 * Creates a [LookupDecorator] for [IEdge]s that can be used to decorate `TInterface` types of the edges.
 * @param [TInterface] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [type] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [decorateNulls] if set to `true` `null` values will be decorated, otherwise not.
 * @param [nullIsFallback] if set to `true` `null` values will be treated as fallback values, otherwise they will be used as the final result.
 * @return A new [LookupDecorator] for the specified interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-method-getDecoratorFor">Online Documentation</a>
 */
 final   fun <TInterface : YObject>getDecoratorFor( type: YClass<TInterface> ,
 decorateNulls: Boolean  = definedExternally,
 nullIsFallback: Boolean  = definedExternally):LookupDecorator<IEdge, TInterface>
/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for edges.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-method-remove">Online Documentation</a>
 */
 final   fun remove( lookup: IContextLookupChainLink<IEdge> )

/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for edges.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorator%23EdgeDecorator-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( lookup: IContextLookupChainLink<IEdge> )

companion object : ClassMetadata<EdgeDecorator> {
}
}

inline operator fun  EdgeDecorator.invoke(
    block: EdgeDecorator.() -> Unit
): EdgeDecorator = apply(block)
