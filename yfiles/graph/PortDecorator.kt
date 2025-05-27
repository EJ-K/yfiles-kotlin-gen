// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.input.IHandle
import yfiles.input.IHandleProvider
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.input.IPortSnapResultProvider
import yfiles.input.IPositionHandler
import yfiles.input.ISnapLineProvider
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.styles.IEdgePathCropper
import yfiles.view.IFocusIndicatorInstaller
import yfiles.view.IHighlightIndicatorInstaller
import yfiles.view.IObstacleProvider
import yfiles.view.ISelectionIndicatorInstaller

/**
 * Helps in [decorating][ILookupDecorator.addLookup] the [ILookup.lookup] method of [IPort] instances by providing access to decorators for the most common types.
 * @see [GraphDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PortDecorator] class.
 * @param [decorator] The decorator to use, which can be `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-constructor-PortDecorator">Online Documentation</a>
 */
external  class PortDecorator  ( decorator: ILookupDecorator?  = definedExternally) : YObject {

/**
 * Gets a [LookupDecorator] that decorates the [IClipboardHelper] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23clipboardHelperDecorator">Online Documentation</a>
 */
final val clipboardHelperDecorator: LookupDecorator<IPort, IClipboardHelper<IPort, *>>
/**
 * Gets a [LookupDecorator] that decorates the [IEdgePathCropper] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23edgePathCropperDecorator">Online Documentation</a>
 */
final val edgePathCropperDecorator: LookupDecorator<IPort, IEdgePathCropper>
/**
 * Gets a [LookupDecorator] that decorates the [IFocusIndicatorInstaller] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23focusIndicatorDecorator">Online Documentation</a>
 */
final val focusIndicatorDecorator: LookupDecorator<IPort, IFocusIndicatorInstaller<IPort>>
/**
 * Gets a [LookupDecorator] that decorates the [IHandle] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23handleDecorator">Online Documentation</a>
 */
final val handleDecorator: LookupDecorator<IPort, IHandle>
/**
 * Gets a [LookupDecorator] that decorates the [IHandleProvider] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23handleProviderDecorator">Online Documentation</a>
 */
final val handleProviderDecorator: LookupDecorator<IPort, IHandleProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IHighlightIndicatorInstaller] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23highlightDecorator">Online Documentation</a>
 */
final val highlightDecorator: LookupDecorator<IPort, IHighlightIndicatorInstaller<IPort>>
/**
 * Gets a [LookupDecorator] that decorates the [ILassoTestable] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23lassoTestableDecorator">Online Documentation</a>
 */
final val lassoTestableDecorator: LookupDecorator<IPort, ILassoTestable>
/**
 * Gets a [LookupDecorator] that decorates the [IMarqueeTestable] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23marqueeTestableDecorator">Online Documentation</a>
 */
final val marqueeTestableDecorator: LookupDecorator<IPort, IMarqueeTestable>
/**
 * Gets a [LookupDecorator] that decorates the [IMementoSupport] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23mementoSupportDecorator">Online Documentation</a>
 */
final val mementoSupportDecorator: LookupDecorator<IPort, IMementoSupport<IPort, *>>
/**
 * Gets a [LookupDecorator] that decorates the [IObstacleProvider] type for [IPort]s this instance has been created for.
 * @see [GraphObstacleProvider][yfiles.view.GraphObstacleProvider]
 * @see [BridgeManager][yfiles.view.BridgeManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23obstacleProviderDecorator">Online Documentation</a>
 */
final val obstacleProviderDecorator: LookupDecorator<IPort, IObstacleProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IPortSnapResultProvider] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23portSnapResultProviderDecorator">Online Documentation</a>
 */
final val portSnapResultProviderDecorator: LookupDecorator<IPort, IPortSnapResultProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23positionHandlerDecorator">Online Documentation</a>
 */
final val positionHandlerDecorator: LookupDecorator<IPort, IPositionHandler>
/**
 * Gets a [LookupDecorator] that decorates the [ISelectionIndicatorInstaller] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23selectionDecorator">Online Documentation</a>
 */
final val selectionDecorator: LookupDecorator<IPort, ISelectionIndicatorInstaller<IPort>>
/**
 * Gets a [LookupDecorator] that decorates the [ISnapLineProvider] type for [IPort]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23snapLineProviderDecorator">Online Documentation</a>
 */
final val snapLineProviderDecorator: LookupDecorator<IPort, ISnapLineProvider<IPort>>
/**
 * Creates a [LookupDecorator] for [IPort]s that can be used to decorate `TInterface` types of the ports.
 * @param [TInterface] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [type] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [decorateNulls] if set to `true` `null` values will be decorated, otherwise not.
 * @param [nullIsFallback] if set to `true` `null` values will be treated as fallback values, otherwise they will be used as the final result.
 * @return A new [LookupDecorator] for the specified interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-method-getDecoratorFor">Online Documentation</a>
 */
 final   fun <TInterface : YObject>getDecoratorFor( type: YClass<TInterface> ,
 decorateNulls: Boolean  = definedExternally,
 nullIsFallback: Boolean  = definedExternally):LookupDecorator<IPort, TInterface>
/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for ports.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-method-remove">Online Documentation</a>
 */
 final   fun remove( lookup: IContextLookupChainLink<IPort> )

/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for ports.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( lookup: IContextLookupChainLink<IPort> )

companion object : ClassMetadata<PortDecorator> {
}
}

inline operator fun  PortDecorator.invoke(
    block: PortDecorator.() -> Unit
): PortDecorator = apply(block)
