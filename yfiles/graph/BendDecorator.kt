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
import yfiles.input.IBendSnapResultProvider
import yfiles.input.IHandle
import yfiles.input.IHandleProvider
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.input.IPositionHandler
import yfiles.lang.ClassMetadata
import yfiles.lang.Func4
import yfiles.lang.IClassMetadata
import yfiles.view.IFocusRenderer
import yfiles.view.IHighlightRenderer
import yfiles.view.IObstacleProvider
import yfiles.view.ISelectionRenderer

/**
 * Helps in [decorating][ILookupDecorator] the [lookup][yfiles.collections.ILookup] method of [IBend] instances by providing access to decorators for the most common types.
 * @see [GraphDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [BendDecorator] class.
 * @param [decorator] The decorator to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-constructor-BendDecorator">Online Documentation</a>
 */
external class BendDecorator (
  decorator: ILookupDecorator  = definedExternally,
)  {
  /**
   * Gets a [LookupDecorator] that decorates the [IClipboardHelper] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23clipboardHelper">Online Documentation</a>
   */
  final val clipboardHelper: LookupDecorator<IBend, IClipboardHelper<IBend, *>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IFocusRenderer] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23focusRenderer">Online Documentation</a>
   */
  final val focusRenderer: LookupDecorator<IBend, IFocusRenderer<IBend>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHandle] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23handle">Online Documentation</a>
   */
  final val handle: LookupDecorator<IBend, IHandle>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHandleProvider] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23handleProvider">Online Documentation</a>
   */
  final val handleProvider: LookupDecorator<IBend, IHandleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHighlightRenderer] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23highlightRenderer">Online Documentation</a>
   */
  final val highlightRenderer: LookupDecorator<IBend, IHighlightRenderer<IBend>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ILassoTestable] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23lassoTestable">Online Documentation</a>
   */
  final val lassoTestable: LookupDecorator<IBend, ILassoTestable>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IMarqueeTestable] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23marqueeTestable">Online Documentation</a>
   */
  final val marqueeTestable: LookupDecorator<IBend, IMarqueeTestable>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IMementoSupport] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23mementoSupport">Online Documentation</a>
   */
  final val mementoSupport: LookupDecorator<IBend, IMementoSupport<IBend, *>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IObstacleProvider] type for [IBend]s this instance has been created for.
   * @see [GraphObstacleProvider][yfiles.view.GraphObstacleProvider]
   * @see [BridgeManager][yfiles.view.BridgeManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23obstacleProvider">Online Documentation</a>
   */
  final val obstacleProvider: LookupDecorator<IBend, IObstacleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23positionHandler">Online Documentation</a>
   */
  final val positionHandler: LookupDecorator<IBend, IPositionHandler>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ISelectionRenderer] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23selectionRenderer">Online Documentation</a>
   */
  final val selectionRenderer: LookupDecorator<IBend, ISelectionRenderer<IBend>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IBendSnapResultProvider] type for [IBend]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23snapResultProvider">Online Documentation</a>
   */
  final val snapResultProvider: LookupDecorator<IBend, IBendSnapResultProvider>
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-method-add">Online Documentation</a>
   */
  fun add(
    link: IContextLookupChainLink<IBend>,
  )
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    link: IContextLookupChainLink<IBend>,
  )
  
  /**
   * Adds a generic callback as a chain link to the lookup.
   * @param [genericLink] The generic callback to add to the lookup chain.
   * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator] to the lookup.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-method-addGenericLookup">Online Documentation</a>
   */
  fun addGenericLookup(
    genericLink: Func4<IBend, IClassMetadata<*>, IContextLookup<*>, Any>,
  ): IContextLookupChainLink<*>
  
  /**
   * Creates a [LookupDecorator] for [IBend]s that can be used to decorate `TInterface` types of the bends.
   * @param [TInterface] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @param [interfaceType] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @return A new [LookupDecorator] for the specified interface.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-method-getDecoratorFor">Online Documentation</a>
   */
  fun <TInterface> getDecoratorFor(
    interfaceType: IClassMetadata<TInterface>,
  ): LookupDecorator<IBend, TInterface>
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for [IBend]s.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-method-remove">Online Documentation</a>
   */
  fun remove(
    link: IContextLookupChainLink<IBend>,
  )
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for [IBend]s.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendDecorator%23BendDecorator-method-remove">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    link: IContextLookupChainLink<IBend>,
  )
  
  companion object : ClassMetadata<BendDecorator> {
  }
}

inline operator fun  BendDecorator.invoke(
    block: BendDecorator.() -> Unit
): BendDecorator = apply(block)
