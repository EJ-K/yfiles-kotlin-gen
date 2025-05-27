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
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.IFocusIndicatorInstaller
import yfiles.view.IHighlightIndicatorInstaller
import yfiles.view.ISelectionIndicatorInstaller

/**
 * Helps in [decorating][ILookupDecorator.addLookup] the [ILookup.lookup] method of [ILabel] instances by providing access to decorators for the most common types.
 * @see [TableDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [StripeLabelDecorator] class.
 * @param [decorator] The decorator to use, which can be `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-constructor-StripeLabelDecorator">Online Documentation</a>
 */
external  class StripeLabelDecorator  ( decorator: ILookupDecorator?  = definedExternally) : YObject {

/**
 * Gets a [LookupDecorator] that decorates the [IEditLabelHelper] type for the [ILabel]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23editLabelHelperDecorator">Online Documentation</a>
 */
final val editLabelHelperDecorator: LookupDecorator<ILabel, IEditLabelHelper>
/**
 * Gets a [LookupDecorator] that decorates the [IFocusIndicatorInstaller] type for the type of items this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23focusIndicatorDecorator">Online Documentation</a>
 */
final val focusIndicatorDecorator: LookupDecorator<ILabel, IFocusIndicatorInstaller<ILabel>>
/**
 * Gets a [LookupDecorator] that decorates the [IHighlightIndicatorInstaller] type for the type of items this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23highlightDecorator">Online Documentation</a>
 */
final val highlightDecorator: LookupDecorator<ILabel, IHighlightIndicatorInstaller<ILabel>>
/**
 * Gets a [LookupDecorator] that decorates the [ILabelModelParameterFinder] type for the [ILabel]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23labelModelParameterFinderDecorator">Online Documentation</a>
 */
final val labelModelParameterFinderDecorator: LookupDecorator<ILabel, ILabelModelParameterFinder>
/**
 * Gets a [LookupDecorator] that decorates the [ILabelModelParameterProvider] type for the [ILabel]s this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23labelModelParameterProviderDecorator">Online Documentation</a>
 */
final val labelModelParameterProviderDecorator: LookupDecorator<ILabel, ILabelModelParameterProvider>
/**
 * Gets a [LookupDecorator] that decorates the [ISelectionIndicatorInstaller] type for the type of items this instance has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23selectionDecorator">Online Documentation</a>
 */
final val selectionDecorator: LookupDecorator<ILabel, ISelectionIndicatorInstaller<ILabel>>
/**
 * Creates a [LookupDecorator] for [ILabel]s that can be used to decorate `TInterface` types of the labels.
 * @param [TInterface] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [type] The type of the interface that should be decorated of the instances' [ILookup.lookup].
 * @param [decorateNulls] if set to `true` `null` values will be decorated, otherwise not.
 * @param [nullIsFallback] if set to `true` `null` values will be treated as fallback values, otherwise they will be used as the final result.
 * @return A new [LookupDecorator] for the specified interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-method-getDecoratorFor">Online Documentation</a>
 */
 final   fun <TInterface : YObject>getDecoratorFor( type: YClass<TInterface> ,
 decorateNulls: Boolean  = definedExternally,
 nullIsFallback: Boolean  = definedExternally):LookupDecorator<ILabel, TInterface>
/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for stripe labels.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-method-remove">Online Documentation</a>
 */
 final   fun remove( lookup: IContextLookupChainLink<ILabel> )

/**
 * Removes an [IContextLookupChainLink] again that has been added by one of the various decorators for stripe labels.
 * @param [lookup] The lookup chain link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelDecorator%23StripeLabelDecorator-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( lookup: IContextLookupChainLink<ILabel> )

companion object : ClassMetadata<StripeLabelDecorator> {
}
}

inline operator fun  StripeLabelDecorator.invoke(
    block: StripeLabelDecorator.() -> Unit
): StripeLabelDecorator = apply(block)
