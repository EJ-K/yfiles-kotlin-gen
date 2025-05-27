// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.input.IBendSnapResultProvider
import yfiles.input.IHandle
import yfiles.input.IHandleProvider
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.input.IPositionHandler
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.IFocusIndicatorInstaller
import yfiles.view.IHighlightIndicatorInstaller
import yfiles.view.IObstacleProvider
import yfiles.view.ISelectionIndicatorInstaller

/**
 * Helps in [decorating][ILookupDecorator.addLookup] the [ILookup.lookup] method of [IBend] instances by providing access to decorators for the most common types.
 * @see [GraphDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [BendDecorator] class.
 * @param [decorator] The decorator to use, which can be `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-constructor-BendDecorator">Online Documentation</a>
 */
external  class BendDecorator  ( decorator: ILookupDecorator?  = definedExternally) : YObject {

/**
 * Gets a [LookupDecorator] that decorates the [IBendSnapResultProvider] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23bendSnapResultProviderDecorator">Online Documentation</a>
 */
final val bendSnapResultProviderDecorator: LookupDecorator<IBend, IBendSnapResultProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IClipboardHelper] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23clipboardHelperDecorator">Online Documentation</a>
 */
final val clipboardHelperDecorator: LookupDecorator<IBend, IClipboardHelper<IBend, *>>
/**
 * Gets a [LookupDecorator] that decorates the [IFocusIndicatorInstaller] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23focusIndicatorDecorator">Online Documentation</a>
 */
final val focusIndicatorDecorator: LookupDecorator<IBend, IFocusIndicatorInstaller<IBend>>
/**
 * Gets a [LookupDecorator] that decorates the [IHandle] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23handleDecorator">Online Documentation</a>
 */
final val handleDecorator: LookupDecorator<IBend, IHandle>
/**
 * Gets a [LookupDecorator] that decorates the [IHandleProvider] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23handleProviderDecorator">Online Documentation</a>
 */
final val handleProviderDecorator: LookupDecorator<IBend, IHandleProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IHighlightIndicatorInstaller] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23highlightDecorator">Online Documentation</a>
 */
final val highlightDecorator: LookupDecorator<IBend, IHighlightIndicatorInstaller<IBend>>
/**
 * Gets a [LookupDecorator] that decorates the [ILassoTestable] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23lassoTestableDecorator">Online Documentation</a>
 */
final val lassoTestableDecorator: LookupDecorator<IBend, ILassoTestable>
/**
 * Gets a [LookupDecorator] that decorates the [IMarqueeTestable] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23marqueeTestableDecorator">Online Documentation</a>
 */
final val marqueeTestableDecorator: LookupDecorator<IBend, IMarqueeTestable>
/**
 * Gets a [LookupDecorator] that decorates the [IMementoSupport] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23mementoSupportDecorator">Online Documentation</a>
 */
final val mementoSupportDecorator: LookupDecorator<IBend, IMementoSupport<IBend, *>>
/**
 * Gets a [LookupDecorator] that decorates the [IObstacleProvider] type for [IBend]s this instance has been created for.
 * @see [GraphObstacleProvider][yfiles.view.GraphObstacleProvider]
 * @see [BridgeManager][yfiles.view.BridgeManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23obstacleProviderDecorator">Online Documentation</a>
 */
final val obstacleProviderDecorator: LookupDecorator<IBend, IObstacleProvider>
/**
 * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23positionHandlerDecorator">Online Documentation</a>
 */
final val positionHandlerDecorator: LookupDecorator<IBend, IPositionHandler>
/**
 * Gets a [LookupDecorator] that decorates the [ISelectionIndicatorInstaller] type for [IBend]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23selectionDecorator">Online Documentation</a>
 */
final val selectionDecorator: LookupDecorator<IBend, ISelectionIndicatorInstaller<IBend>>
/**
 * Creates a [LookupDecorator] for [IBend]s that can be used to decorate `TInterface` types of the bends.
 * @param [TInterface] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [type] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [decorateNulls] if set to `true` `null` values will be decorated, otherwise not.
 * @param [nullIsFallback] if set to `true` `null` values will be treated as fallback values, otherwise they will be used as the final result.
 * @return A new [LookupDecorator] for the specified interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-method-getDecoratorFor">Online Documentation</a>
 */
 final   fun <TInterface : YObject>getDecoratorFor( type: YClass<TInterface> ,
 decorateNulls: Boolean  = definedExternally,
 nullIsFallback: Boolean  = definedExternally):LookupDecorator<IBend, TInterface>
/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for [IBend]s.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-method-remove">Online Documentation</a>
 */
 final   fun remove( lookup: IContextLookupChainLink<IBend> )

/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for [IBend]s.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( lookup: IContextLookupChainLink<IBend> )

companion object : ClassMetadata<BendDecorator> {
}
}

inline operator fun  BendDecorator.invoke(
    block: BendDecorator.() -> Unit
): BendDecorator = apply(block)
