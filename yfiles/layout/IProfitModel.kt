// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A [IProfitModel] ranks [LabelCandidate]s used for prioritizing certain label locations over others.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IProfitModel">Online Documentation</a>
 */
external interface IProfitModel : YObject {
/**
 * Returns the profit for placing a label using the given [LabelCandidate].
 * @param [candidate] the candidate
 * @return the profit of the candidate
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IProfitModel%23IProfitModel-method-getProfit">Online Documentation</a>
 */
   fun getProfit( candidate: LabelCandidate ):Double

companion object : InterfaceMetadata<IProfitModel> {

/**
 * Creates an implementation of the interface [IProfitModel] by using the given function as implementation for its [getProfit] method.
 * @param [getProfit] A function for [IProfitModel]'s single abstract method [getProfit].
 * @return An instance of the [IProfitModel] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IProfitModel%23IProfitModel-method-create">Online Documentation</a>
 */
@JsName("create")
operator fun  invoke(
    getProfit: (
candidate: LabelCandidate
) -> Double 
):IProfitModel
}
}
