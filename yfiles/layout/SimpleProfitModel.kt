// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * [SimpleProfitModel] implements the ranking for edge and node labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleProfitModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SimpleProfitModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleProfitModel%23SimpleProfitModel-constructor-SimpleProfitModel">Online Documentation</a>
 */
external open class SimpleProfitModel  () : IProfitModel {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleProfitModel%23SimpleProfitModel-method-getProfit">Online Documentation</a>
 */
 override   fun getProfit( candidate: LabelCandidate ):Double

companion object : ClassMetadata<SimpleProfitModel> {
}
}
